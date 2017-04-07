package io.xmt.lost.pojo;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class User
{
	// CREATE TABLE users (
	// 	id varchar(32) NOT NULL COMMENT 'id',
	// 	name varchar(255) NOT NULL COMMENT '用户名',
	// 	pass varchar(32) NOT NULL COMMENT '用户密码',
	// 	real_name varchar(255) NOT NULL COMMENT '真实姓名',
	// 	phone varchar(20) NOT NULL COMMENT '手机号码',
	// 	secret_id varchar(32) DEFAULT NULL COMMENT '密保id',
	// 	secret_ans varchar(255) DEFAULT NULL COMMENT '密保答案',
	// 	is_admin tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否为管理员',
	// 	PRIMARY KEY (id)
	// ) COMMENT = '用户列表'
	
	private String id;
	private String name;
	private String pass;
	private String realName;
	private String phone;
	private String secretId;
	private String secretAns;
	private Integer isAdmin;
	
	public User()
	{
	}
	
	public User(String id, String name, String pass, String realName, String phone, String secretId, String secretAns, Integer isAdmin)
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
	
	@Override
	public String toString()
	{
		return "User{" +
			"id='" + id + '\'' +
			", name='" + name + '\'' +
			", pass='" + pass + '\'' +
			", realName='" + realName + '\'' +
			", phone='" + phone + '\'' +
			", secretId='" + secretId + '\'' +
			", secretAns='" + secretAns + '\'' +
			", isAdmin=" + isAdmin +
			'}';
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
