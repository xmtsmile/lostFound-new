package io.xmt.lost.controller;

import io.xmt.lost.controller.vo.PostVo;
import io.xmt.lost.pojo.User;
import io.xmt.lost.service.PostService;
import io.xmt.lost.util.FileUtil;
import io.xmt.lost.util.HashUtil;
import io.xmt.lost.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 注：以下的操作接口里会自己判断是否为管理员
 * @Author fisheax
 * @Date 3/19/2017
 */
@Controller
@RequestMapping("/post")
public class PostController
{
	private PostService postService;
	
	/**
	 * 发布信息，丢失或捡拾
	 * @param post
	 * @return
	 */
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	@ResponseBody
	public Response createPost(@RequestBody PostVo post)
	{
		return postService.createPost(post);
	}
	
	/**
	 * 修改用户的post信息
	 * @param post
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Response updatePost(@RequestBody PostVo post)
	{
		return postService.updatePost(post);
	}
	
	/**
	 * 删除用户的post信息
	 * @param postIds
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public Response deletePosts(@RequestParam("postIds") String postIds)
	{
		return postService.deletePosts(postIds);
	}
	
	/**
	 * 列出用户的所有post
	 * @param source 0: 丢失 1: 捡拾
	 * @param start
	 * @param size
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public Response listPosts(@RequestParam("source") String source,
	                          @RequestParam("start") Long start,
	                          @RequestParam("size") Long size,
	                          @ModelAttribute("user") User user)
	{
		String userId = user.getId();
		return postService.listPosts(start, size, source, null, null, userId);
	}
	
	/**
	 * 分类浏览
	 * @param start
	 * @param size
	 * @param source
	 * @param kindId
	 * @param time
	 * @return
	 */
	@RequestMapping(value = "/nav", method = RequestMethod.GET)
	@ResponseBody
	public Response navigatePosts(@RequestParam("start") Long start,
	                              @RequestParam("size") Long size,
	                              @RequestParam(value = "source", required = false) String source,
	                              @RequestParam(value = "kindId", required = false) String kindId,
	                              @RequestParam(value = "time", required = false) String time)
	{
		return postService.listPosts(start, size, source, kindId, time, null);
	}
	
	/**
	 * 找回物品
	 * @param postId
	 * @return
	 */
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public Response getBack(@RequestParam("postId") String postId)
	{
		return postService.getObjectBack(postId);
	}
	
	/**
	 * 归还物品
	 * @param postId
	 * @return
	 */
	@RequestMapping(value = "/return", method = RequestMethod.GET)
	@ResponseBody
	public Response returnBack(@RequestParam("postId") String postId)
	{
		return postService.returnObjectBack(postId);
	}
	
	/**
	 * 遗失物品统计
	 * @return
	 */
	@RequestMapping(value = "/lost/count", method = RequestMethod.GET)
	@ResponseBody
	public Response lostCount()
	{
		return postService.lostCount();
	}
	
	/**
	 * 捡拾物品统计
	 * @return
	 */
	@RequestMapping(value = "/found/count", method = RequestMethod.GET)
	@ResponseBody
	public Response foundCount()
	{
		return postService.foundCount();
	}
	
	/**
	 * 找回或归还物品统计
	 * @return
	 */
	@RequestMapping(value = "/back/count", method = RequestMethod.GET)
	@ResponseBody
	public Response getOrRetBackCount()
	{
		return postService.getOrRetBackCount();
	}
	
	/**
	 * 上传图片
	 * @param multipartFile
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public Response uploadPics(MultipartFile multipartFile, HttpServletRequest request)
	{
		String fileName = HashUtil.uuid() + FileUtil.getFileExtName(multipartFile.getOriginalFilename());
		String basePath = request.getServletContext().getRealPath("/") + "/WEB-INF/assets/images/";
		
		try
		{
			multipartFile.transferTo(new File(basePath + fileName));
		}
		catch (IOException e)
		{
			return Response.failed(100010, "failed uploading");
		}
		
		return Response.success("succeed uploading").result("/images/" + fileName);
	}
	
	// ================================================================================================
	
	@Autowired
	public PostController(PostService postService)
	{
		Assert.notNull(postService);
		
		this.postService = postService;
	}
}
