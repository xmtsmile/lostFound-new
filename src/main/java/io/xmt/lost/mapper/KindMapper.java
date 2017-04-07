package io.xmt.lost.mapper;

import io.xmt.lost.pojo.Kind;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public interface KindMapper
{
	Kind getKindById(@Param("id") String kindId);
	
	List<Kind> getKinds(@Param("start") Long start,
	                    @Param("size") Long size);
	
	long getKindsCount();
	
	int addKind(Kind kind);
	
	int modifyKind(Kind kind);
	
	int deleteKinds(@Param("kindIds") List<String> kindIds);
}
