package io.xmt.lost.pojo;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class Contact
{
	// CREATE TABLE contacts (
	// 	id varchar(32) NOT NULL COMMENT 'id',
	// 	psn_name varchar(50) DEFAULT NULL COMMENT '姓名',
	// 	phone varchar(20) DEFAULT NULL COMMENT '手机号码',
	// 	email varchar(50) DEFAULT NULL COMMENT '邮箱',
	// 	qq varchar(20) DEFAULT NULL COMMENT 'QQ号',
	//  address varchar(1000) DEFAULT NULL COMMENT '地址',
	// 	PRIMARY KEY (id)
	// ) COMMENT = '联系方式'
	
	private String id;
	private String psnName;
	private String phone;
	private String email;
	private String qq;
	private String address;
	
	public Contact()
	{
	}
	
	public Contact(String id, String psnName, String phone, String email, String qq, String address)
	{
		this.id = id;
		this.psnName = psnName;
		this.phone = phone;
		this.email = email;
		this.qq = qq;
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return "Contact{" +
			"id='" + id + '\'' +
			", psnName='" + psnName + '\'' +
			", phone='" + phone + '\'' +
			", email='" + email + '\'' +
			", qq='" + qq + '\'' +
			", address='" + address + '\'' +
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
	
	public String getQq()
	{
		return qq;
	}
	
	public void setQq(String qq)
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
