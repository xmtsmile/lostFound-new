package io.xmt.lost.controller;

import io.xmt.lost.controller.vo.UserVo;
import io.xmt.lost.pojo.User;
import io.xmt.lost.service.KindService;
import io.xmt.lost.service.UserService;
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

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
@Controller
@RequestMapping("/admin")
public class AdminController
{
	private UserService userService;
	private KindService kindService;
	
	/**
	 * 管理员修改密码
	 * @param oldPass
	 * @param newPass
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
	 * 列出所有用户
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value = "/users/list", method = RequestMethod.GET)
	@ResponseBody
	public Response listUsers(@RequestParam("start") Long start,
	                          @RequestParam("size") Long size)
	{
		return userService.listUsers(start, size);
	}
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/user/modify", method = RequestMethod.POST)
	@ResponseBody
	public Response modifyUser(@RequestBody UserVo user)
	{
		return userService.modifyUser(user);
	}
	
	/**
	 * 批量删除用户
	 * @param userIds
	 * @return
	 */
	@RequestMapping(value = "/users/delete", method = RequestMethod.GET)
	@ResponseBody
	public Response deleteUsers(@RequestParam("userIds") String userIds)
	{
		return userService.deleteUserByIds(userIds);
	}
	
	// ================================================================================================
	
	/**
	 * 列出所有分类
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value = "/kinds/list", method = RequestMethod.GET)
	@ResponseBody
	public Response listKinds(@RequestParam("start") Long start,
	                          @RequestParam("size") Long size)
	{
		return kindService.listKinds(start, size);
	}
	
	/**
	 * 修改分类信息
	 * @param kindId
	 * @param newKindName
	 * @return
	 */
	@RequestMapping(value = "/kind/modify", method = RequestMethod.POST)
	@ResponseBody
	public Response modifyKind(@RequestParam("kindId") String kindId,
	                           @RequestParam("newKindName") String newKindName)
	{
		return kindService.modifyKind(kindId, newKindName);
	}
	
	/**
	 * 批量删除分类
	 * @param kindIds
	 * @return
	 */
	@RequestMapping(value = "/kinds/delete", method = RequestMethod.GET)
	@ResponseBody
	public Response deleteKinds(@RequestParam("kindIds") String kindIds)
	{
		return kindService.deleteKindsByIds(kindIds);
	}
	
	// ================================================================================================
	
	@Autowired
	public AdminController(UserService userService, KindService kindService)
	{
		Assert.notNull(userService);
		Assert.notNull(kindService);
		
		this.userService = userService;
		this.kindService = kindService;
	}
}
