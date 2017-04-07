package io.xmt.lost.util;

import java.util.Base64;
import java.util.UUID;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class HashUtil
{
	
	/**
	 * 生成32位UUID
	 * @return
	 */
	public static String uuid()
	{
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * 生成重置密码
	 * @return
	 */
	public static String rpass()
	{
		return Base64.getEncoder().encodeToString(uuid().substring(16).getBytes());
	}
}
