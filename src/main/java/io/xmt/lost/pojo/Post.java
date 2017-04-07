package io.xmt.lost.pojo;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class Post
{
	// CREATE TABLE posts (
	// 	id varchar(32) NOT NULL COMMENT 'id',
	// 	title varchar(1000) NOT NULL COMMENT '标题',
	//  user_id varchar(32) NOT NULL COMMENT '用户id',
	// 	object_id varchar(32) NOT NULL COMMENT '物品id',
	// 	contact_id varchar(32) NOT NULL COMMENT '联系人id',
	// 	obj_detail text DEFAULT NULL COMMENT '物品描述',
	// 	loc_detail text DEFAULT NULL COMMENT '地点描述',
	// 	PRIMARY KEY (id)
	// ) COMMENT = '发布的信息(丢失/捡拾)'
	
	private String id;
	private String title;
	private String userId;
	private String objectId;
	private String contactId;
	private String objDetail;
	private String locDetail;
	
	public Post()
	{
	}
	
	public Post(String id, String title, String userId, String objectId, String contactId, String objDetail, String locDetail)
	{
		this.id = id;
		this.title = title;
		this.userId = userId;
		this.objectId = objectId;
		this.contactId = contactId;
		this.objDetail = objDetail;
		this.locDetail = locDetail;
	}
	
	@Override
	public String toString() {
		return "Post{" +
			"id='" + id + '\'' +
			", title='" + title + '\'' +
			", userId='" + userId + '\'' +
			", objectId='" + objectId + '\'' +
			", contactId='" + contactId + '\'' +
			", objDetail='" + objDetail + '\'' +
			", locDetail='" + locDetail + '\'' +
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
	
	public String getObjectId()
	{
		return objectId;
	}
	
	public void setObjectId(String objectId)
	{
		this.objectId = objectId;
	}
	
	public String getContactId()
	{
		return contactId;
	}
	
	public void setContactId(String contactId)
	{
		this.contactId = contactId;
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
}
