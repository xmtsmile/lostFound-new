package io.xmt.lost.controller.vo;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class PostVo
{
	private String id;
	private String title;
	private String userId;
	private String objDetail;
	private String locDetail;
	private ObjectVo object;
	private ContactVo contact;
	
	public PostVo()
	{
	}
	
	public PostVo(String id, String title, String userId, String objDetail, String locDetail, ObjectVo object, ContactVo contact)
	{
		this.id = id;
		this.title = title;
		this.userId = userId;
		this.objDetail = objDetail;
		this.locDetail = locDetail;
		this.object = object;
		this.contact = contact;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getUserId()
	{
		return userId;
	}
	
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	
	public String getObjDetail()
	{
		return objDetail;
	}
	
	public void setObjDetail(String objDetail)
	{
		this.objDetail = objDetail;
	}
	
	public String getLocDetail()
	{
		return locDetail;
	}
	
	public void setLocDetail(String locDetail)
	{
		this.locDetail = locDetail;
	}
	
	public ContactVo getContact()
	{
		return contact;
	}
	
	public void setContact(ContactVo contact)
	{
		this.contact = contact;
	}
	
	public ObjectVo getObject()
	{
		return object;
	}
	
	public void setObject(ObjectVo object)
	{
		this.object = object;
	}
	
}
