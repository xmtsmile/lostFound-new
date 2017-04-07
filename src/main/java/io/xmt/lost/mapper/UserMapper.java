package io.xmt.lost.mapper;

import io.xmt.lost.pojo.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public interface UserMapper
{
	User getUserById(@Param("id") String userId);
	
	User getUserByName(@Param("name") String username);
	
	User authUserByPass(@Param("name") String name,
	                    @Param("pass") String pass);
	
	List<User> getUsers(@Param("start") Long start,
	                    @Param("size") Long size);
	
	long getUsersCount();
	
	int addUser(User user);
	
	int updateUserPass(@Param("userId") String userId,
	                    @Param("oldPass") String oldPass,
	                    @Param("newPass") String newPass);
	
	int resetUserPass(@Param("name") String name,
	                  @Param("secretId") String secretId,
	                  @Param("secretAns") String secretAns,
	                  @Param("newPass") String newPass);
	
	int modifyUser(User user);
	
	int deleteUsers(@Param("userIds") List<String> userIds);
}
