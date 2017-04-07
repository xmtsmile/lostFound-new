package io.xmt.lost.controller.vo;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class UserVo
{
	private String id;
	private String name;
	private String pass;
	private String realName;
	private String phone;
	private String secretId;
	private String secretAns;
	private Integer isAdmin;
	
	public UserVo()
	{
	}
	
	public UserVo(String id, String name, String pass, String realName, String phone, String secretId, String secretAns, Integer isAdmin)
	{
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.realName = realName;
		this.phone = phone;
		this.secretId = secretId;
		this.secretAns = secretAns;
		this.isAdmin = isAdmin;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPass()
	{
		return pass;
	}
	
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	
	public String getRealName()
	{
		return realName;
	}
	
	public void setRealName(String realName)
	{
		this.realName = realName;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getSecretId()
	{
		return secretId;
	}
	
	public void setSecretId(String secretId)
	{
		this.secretId = secretId;
	}
	
	public String getSecretAns()
	{
		return secretAns;
	}
	
	public void setSecretAns(String secretAns)
	{
		this.secretAns = secretAns;
	}
	
	public Integer getIsAdmin()
	{
		return isAdmin;
	}
	
	public void setIsAdmin(Integer isAdmin)
	{
		this.isAdmin = isAdmin;
	}
}
