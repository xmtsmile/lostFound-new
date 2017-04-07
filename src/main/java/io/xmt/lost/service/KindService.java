package io.xmt.lost.service;

import io.xmt.lost.mapper.KindMapper;
import io.xmt.lost.pojo.Kind;
import io.xmt.lost.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
@Service
public class KindService
{
	@Autowired
	private KindMapper kindMapper;
	
	/**
	 * 批量删除分类
	 * @param kindIds
	 * @return
	 */
	public Response deleteKindsByIds(String kindIds)
	{
		List<String> kindIdList = Arrays.asList(kindIds.split(","));
		if (kindIdList.size() == 0)
		{
			return Response.success();
		}
		
		int count = kindMapper.deleteKinds(kindIdList);
		return new Response()
			.code(count == kindIdList.size() ? 0 : 10005)
			.msg(count == kindIdList.size() ? "succed delete the kinds" : "failed to delete the kinds");
	}
	
	/**
	 * 修改分类名称
	 * @param kindId
	 * @param newKindName
	 * @return
	 */
	public Response modifyKind(String kindId, String newKindName)
	{
		Kind kind = new Kind();
		kind.setId(kindId);
		kind.setName(newKindName);
		int count = kindMapper.modifyKind(kind);
		
		return new Response()
			.code(count == 1 ? 0 : 10006)
			.msg(count == 1 ? "succed modified the kind" : "failed to modified the kind");
	}
	
	/**
	 * 获取分类列表
	 * @param start
	 * @param size
	 * @return
	 */
	public Response listKinds(Long start, Long size)
	{
		List<Kind> kinds = kindMapper.getKinds(start, size);
		HashMap<String, Object> result = new HashMap<>();
		result.put("start", start);
		result.put("size", kinds.size());
		result.put("count", kindMapper.getKindsCount());
		result.put("data", kinds);
		
		return Response.success().result(result);
	}
}
