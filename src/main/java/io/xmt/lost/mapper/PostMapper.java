package io.xmt.lost.mapper;

import io.xmt.lost.pojo.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public interface PostMapper
{
	Post getPostById(@Param("id") String postId);
	
	List<Post> getPostsWithCondition(@Param("start") Long start,
	                                 @Param("size") Long size,
	                                 @Param("source") String source,
	                                 @Param("kindId") String kindId,
	                                 @Param("btime") String btime,
	                                 @Param("etime") String etime,
	                                 @Param("userId") String userId);
	
	long getPostsCountWithCondition(@Param("source") String source,
	                                @Param("kindId") String kindId,
	                                @Param("btime") String btime,
	                                @Param("etime") String etime,
	                                @Param("userId") String userId);
	
	long lostCount();
	
	long foundCount();
	
	long backCount();
	
	int addPost(Post post);
	
	int modifyPost(Post post);
	
	int deletePosts(@Param("postIds") List<String> postIds);
}
