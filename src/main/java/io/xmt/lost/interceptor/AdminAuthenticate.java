package io.xmt.lost.interceptor;

import io.xmt.lost.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class AdminAuthenticate implements HandlerInterceptor
{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		HttpSession session = request.getSession();
		if (session == null)
		{
			return false;
		}
		
		User user = (User) session.getAttribute("user");
		return user != null && "1".equals(user.getIsAdmin().toString());
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
	{
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
	{
	}
}
