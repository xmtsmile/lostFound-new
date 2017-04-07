package io.xmt.lost.service;

import io.xmt.lost.controller.vo.UserVo;
import io.xmt.lost.exception.UserException;
import io.xmt.lost.mapper.UserMapper;
import io.xmt.lost.pojo.Kind;
import io.xmt.lost.pojo.User;
import io.xmt.lost.util.HashUtil;
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
public class UserService
{
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 注册用户
	 * @param userVo
	 * @return
	 * @throws UserException
	 */
	public Response register(UserVo userVo) throws UserException
	{
		User user = userMapper.getUserByName(userVo.getName());
		if (user != null)
		{
			return Response.failed(10001, "the username exists");
		}
		
		user = new User(HashUtil.uuid(),
			userVo.getName(),
			userVo.getPass(),
			userVo.getRealName(),
			userVo.getPhone(),
			userVo.getSecretId(),
			userVo.getSecretAns(),
			userVo.getIsAdmin());
		userMapper.addUser(user);
		return Response.success("succeed register the user");
	}
	
	/**
	 * 用户登录验证
	 * @param name
	 * @param pass
	 * @return
	 */
	public User login(String name, String pass)
	{
		return userMapper.authUserByPass(name, pass);
	}
	
	/**
	 * 用户修改密码
	 * @param userId
	 * @param oldPass
	 * @param newPass
	 * @return
	 */
	public Response modifyPass(String userId, String oldPass, String newPass)
	{
		int count = userMapper.updateUserPass(userId, oldPass, newPass);
		return new Response()
			.code(count == 1 ? 0 : 10002)
			.msg(count == 1 ? "succed modified the password" : "failed to modified the password");
	}
	
	/**
	 * 重置用户密码
	 * @param name
	 * @param secretId
	 * @param secretAns
	 * @param newPass
	 * @return
	 */
	public Response resetPass(String name, String secretId, String secretAns, String newPass)
	{
		int count = userMapper.resetUserPass(name, secretId, secretAns, newPass);
		return new Response()
			.code(count == 1 ? 0 : 10002)
			.msg(count == 1 ? "succed modified the password" : "failed to modified the password")
			.result(count == 1 ? newPass : null);
	}
	
	/**
	 * 修改用户信息
	 * @param userVo
	 * @return
	 */
	public Response modifyUser(UserVo userVo)
	{
		User user = new User(userVo.getId(),
			userVo.getName(),
			userVo.getPass(),
			userVo.getRealName(),
			userVo.getPhone(),
			userVo.getSecretId(),
			userVo.getSecretAns(),
			userVo.getIsAdmin());
		int count = userMapper.modifyUser(user);
		return new Response()
			.code(count == 1 ? 0 : 10003)
			.msg(count == 1 ? "succed modified the user" : "failed to modified the user");
	}
	
	/**
	 * 批量删除用户
	 * @param userIds
	 * @return
	 */
	public Response deleteUserByIds(String userIds)
	{
		List<String> userIdList = Arrays.asList(userIds.split(","));
		if (userIdList.size() == 0)
		{
			return Response.success();
		}
		
		int count = userMapper.deleteUsers(userIdList);
		return new Response()
			.code(count == userIdList.size() ? 0 : 10004)
			.msg(count == userIdList.size() ? "succed delete the users" : "failed to delete the users");
	}
	
	/**
	 * 获取用户列表
	 * @param start
	 * @param size
	 * @return
	 */
	public Response listUsers(Long start, Long size)
	{
		List<User> users = userMapper.getUsers(start, size);
		HashMap<String, Object> result = new HashMap<>();
		result.put("start", start);
		result.put("size",users.size());
		result.put("count", userMapper.getUsersCount());
		result.put("data", users);
		
		return Response.success().result(result);
	}
}
