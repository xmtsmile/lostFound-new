package io.xmt.lost.controller;

import io.xmt.lost.controller.vo.UserVo;
import io.xmt.lost.pojo.User;
import io.xmt.lost.service.UserService;
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

import javax.servlet.http.HttpSession;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
@Controller
@RequestMapping("/user")
public class UserController
{
	private UserService userService;
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public Response register(@RequestBody UserVo user)
	{
		return userService.register(user);
	}
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Response login(@RequestParam("name") String username,
	                      @RequestParam("pass") String password,
	                      HttpSession session)
	{
		User user = userService.login(username, password);
		if (user == null)
		{
			return Response.failed(10001, "the user does not exist");
		}
		
		session.setAttribute("user", user);
		return Response.success();
	}
	
	/**
	 * 用户登出
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	@ResponseBody
	public Response logout(HttpSession session)
	{
		session.invalidate();
		return Response.success();
	}
	
	/**
	 * 用户修改密码
	 * @param oldPass 原密码
	 * @param newPass 新密码
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/pass/update", method = RequestMethod.POST)
	@ResponseBody
	public Response changePwd(@RequestParam("oldPass") String oldPass,
	                          @RequestParam("newPass") String newPass,
	                          @ModelAttribute("user") User user)
	{
		String userId = user.getId();
		return userService.modifyPass(userId, oldPass, newPass);
	}
	
	/**
	 * 用户密码重置
	 * @param username
	 * @param secretId
	 * @param secretAns
	 * @return
	 */
	@RequestMapping(value = "/pass/reset", method = RequestMethod.POST)
	@ResponseBody
	public Response resetPwd(@RequestParam("name") String username,
	                         @RequestParam("secretId") String secretId,
	                         @RequestParam("secretAns") String secretAns)
	{
		String newPass = HashUtil.rpass();
		return userService.resetPass(username, secretId, secretAns, newPass);
	}
	
	@Autowired
	public UserController(UserService userService)
	{
		Assert.notNull(userService);
		
		this.userService = userService;
	}
}
