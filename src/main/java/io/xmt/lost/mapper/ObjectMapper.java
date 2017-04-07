package io.xmt.lost.mapper;

import io.xmt.lost.pojo.XObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author fisheax
 * @Date 3/20/2017
 */
public interface ObjectMapper
{
	int addObject(XObject xobject);
	
	int modifyObject(XObject xobject);
	
	int getObjectBack(@Param("objectId") String obejctId);
	
	int returnObjectBack(@Param("objectId") String objectId);
	
	int deleteObjects(@Param("objectIds") List<String> objectIds);
}
