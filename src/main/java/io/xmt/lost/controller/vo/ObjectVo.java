package io.xmt.lost.controller.vo;

/**
 * @Author fisheax
 * @Date 3/20/2017
 */
public class ObjectVo
{
	private String id;
	private String fkindId;
	private String skindId;
	private String type;
	private String picPath;
	
	public ObjectVo()
	{
	}
	
	public ObjectVo(String id, String fkindId, String skindId, String type, String picPath)
	{
		this.id = id;
		this.fkindId = fkindId;
		this.skindId = skindId;
		this.type = type;
		this.picPath = picPath;
	}
	
	@Override
	public String toString()
	{
		return "ObjectVo{" +
			"id='" + id + '\'' +
			", fkindId='" + fkindId + '\'' +
			", skindId='" + skindId + '\'' +
			", type='" + type + '\'' +
			", picPath='" + picPath + '\'' +
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
	
	public String getFkindId()
	{
		return fkindId;
	}
	
	public void setFkindId(String fkindId)
	{
		this.fkindId = fkindId;
	}
	
	public String getSkindId()
	{
		return skindId;
	}
	
	public void setSkindId(String skindId)
	{
		this.skindId = skindId;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getPicPath()
	{
		return picPath;
	}
	
	public void setPicPath(String picPath)
	{
		this.picPath = picPath;
	}
}
