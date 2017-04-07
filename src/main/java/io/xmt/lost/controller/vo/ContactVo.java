package io.xmt.lost.controller.vo;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class ContactVo
{
	private String id;
	private String psnName;
	private String phone;
	private String email;
	private String qq;
	private String address;
	
	public ContactVo()
	{
	}
	
	public ContactVo(String id, String psnName, String phone, String email, String qq, String address)
	{
		this.id = id;
		this.psnName = psnName;
		this.phone = phone;
		this.email = email;
		this.qq = qq;
		this.address = address;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getPsnName()
	{
		return psnName;
	}
	
	public void setPsnName(String psnName)
	{
		this.psnName = psnName;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getQQ()
	{
		return qq;
	}
	
	public void setQQ(String qq)
	{
		this.qq = qq;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
}
