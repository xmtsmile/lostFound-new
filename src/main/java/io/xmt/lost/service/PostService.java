package io.xmt.lost.service;

import io.xmt.lost.controller.vo.PostVo;
import io.xmt.lost.exception.PostException;
import io.xmt.lost.mapper.ContactMapper;
import io.xmt.lost.mapper.ObjectMapper;
import io.xmt.lost.mapper.PostMapper;
import io.xmt.lost.pojo.Contact;
import io.xmt.lost.pojo.XObject;
import io.xmt.lost.pojo.Post;
import io.xmt.lost.util.HashUtil;
import io.xmt.lost.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
@Service
public class PostService
{
	private PostMapper postMapper;
	private ObjectMapper objectMapper;
	private ContactMapper contactMapper;
	
	/**
	 * 发布新消息
	 * @param postVo
	 * @return
	 */
	public Response createPost(PostVo postVo)
	{
		XObject xobject = new XObject(HashUtil.uuid(),
			postVo.getObject().getFkindId(),
			postVo.getObject().getSkindId(),
			convertType(postVo.getObject().getType()),
			null,
			postVo.getObject().getPicPath());
		
		Contact contact = new Contact(HashUtil.uuid(),
			postVo.getContact().getPsnName(),
			postVo.getContact().getPhone(),
			postVo.getContact().getEmail(),
			postVo.getContact().getQQ(),
			postVo.getContact().getAddress());
		
		Post post = new Post(HashUtil.uuid(),
			postVo.getTitle(),
			postVo.getUserId(),
			xobject.getId(),
			contact.getId(),
			postVo.getObjDetail(),
			postVo.getLocDetail());
		
		objectMapper.addObject(xobject);
		contactMapper.addContact(contact);
		postMapper.addPost(post);
		
		return Response.success("succed adding a new post");
	}
	
	/**
	 * type(0 捡拾 1 丢失) -> status(0 未归还 1 已归还 2 已丢失 3 已找回)
	 * @param type
	 * @return
	 */
	private Integer convertType(String type)
	{
		switch (type)
		{
			case "0": return 0;
			case "1": return 3;
		}
		
		throw new PostException("invalid type");
	}
	
	/**
	 * status(0 未归还 1 已归还 2 已丢失 3 已找回) -> type(0 捡拾 1 丢失)
	 * @param status
	 * @return
	 */
	private String convertStatus(Integer status)
	{
		switch (status)
		{
			case 0:
			case 1:
				return "0";
			case 2:
			case 3:
				return "1";
		}
		
		throw new PostException("invalid status");
	}
	
	/**
	 * 更新消息
	 * @param postVo
	 * @return
	 */
	public Response updatePost(PostVo postVo)
	{
		XObject xobject = new XObject(postVo.getObject().getId(),
			postVo.getObject().getFkindId(),
			postVo.getObject().getSkindId(),
			convertType(postVo.getObject().getType()),
			null,
			postVo.getObject().getPicPath());
		
		Contact contact = new Contact(postVo.getContact().getId(),
			postVo.getContact().getPsnName(),
			postVo.getContact().getPhone(),
			postVo.getContact().getEmail(),
			postVo.getContact().getQQ(),
			postVo.getContact().getAddress());
		
		Post post = new Post(postVo.getId(),
			postVo.getTitle(),
			postVo.getUserId(),
			xobject.getId(),
			contact.getId(),
			postVo.getObjDetail(),
			postVo.getLocDetail());
		
		objectMapper.modifyObject(xobject);
		contactMapper.modifyContact(contact);
		postMapper.modifyPost(post);
		
		return Response.success("succed adding a new post");
	}
	
	/**
	 * 删除已发布的信息
	 * @param postIds
	 * @return
	 */
	public Response deletePosts(String postIds)
	{
		List<String> postIdList = Arrays.asList(postIds.split(","));
		if (postIdList.size() == 0)
		{
			return Response.success();
		}
		
		// here does not delete the relate object info and contact info
		int count = postMapper.deletePosts(postIdList);
		return new Response()
			.code(count == postIdList.size() ? 0 : 10004)
			.msg(count == postIdList.size() ? "succed delete the posts" : "failed to delete the posts");
	}
	
	/**
	 * 发布信息列表
	 * @param start
	 * @param size
	 * @param source
	 * @param kindId
	 * @param time
	 * @return
	 */
	public Response listPosts(Long start, Long size, String source, String kindId, String time, String userId)
	{
		String[] times = time.split("-");
		String btime = times[0] + "000000";
		String etime = times[1] + "000000";
		
		List<Post> posts = postMapper.getPostsWithCondition(start, size, source, kindId, btime, etime, userId);
		HashMap<String, java.lang.Object> result = new HashMap<>();
		result.put("start", start);
		result.put("size", posts.size());
		result.put("count", postMapper.getPostsCountWithCondition(source, kindId, btime, etime, userId));
		result.put("data", posts);
		
		return Response.success().result(result);
	}
	
	/**
	 * 标记已找回物品
	 * @param postId
	 * @return
	 */
	public Response getObjectBack(String postId)
	{
		Post post = postMapper.getPostById(postId);
		if (post == null)
		{
			throw new PostException("the post does not exists");
		}
		
		int count = objectMapper.getObjectBack(post.getObjectId());
		return new Response()
			.code(count == 1 ? 0 : 10010)
			.msg(count == 1 ? "succed get back the object" : "failed to get back the object");
	}
	
	/**
	 * 标记已归还物品
	 * @param postId
	 * @return
	 */
	public Response returnObjectBack(String postId)
	{
		Post post = postMapper.getPostById(postId);
		if (post == null)
		{
			throw new PostException("the post does not exists");
		}
		
		int count = objectMapper.returnObjectBack(post.getObjectId());
		return new Response()
			.code(count == 1 ? 0 : 10010)
			.msg(count == 1 ? "succed return back the object" : "failed to return back the object");
	}
	
	/**
	 * 遗失物品统计
	 * @return
	 */
	public Response lostCount()
	{
		return Response.success().result(postMapper.lostCount());
	}
	
	/**
	 * 捡拾物品统计
	 * @return
	 */
	public Response foundCount()
	{
		return Response.success().result(postMapper.foundCount());
	}
	
	/**
	 * 找回或归还物品统计
	 * @return
	 */
	public Response getOrRetBackCount()
	{
		return Response.success().result(postMapper.backCount());
	}
	
	// ================================================================================================
	
	@Autowired
	public PostService(PostMapper postMapper, ObjectMapper objectMapper, ContactMapper contactMapper)
	{
		Assert.notNull(postMapper);
		Assert.notNull(objectMapper);
		Assert.notNull(contactMapper);
		
		this.postMapper = postMapper;
		this.objectMapper = objectMapper;
		this.contactMapper = contactMapper;
	}
}
