package io.xmt.lost.pojo;

import java.sql.Time;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class XObject
{
	// CREATE TABLE objects (
	// 	id varchar(32) NOT NULL COMMENT 'id',
	//  fkind_id varchar(32) NOT NULL COMMENT '一级分类id，区域',
	//  skind_id varchar(32) NOT NULL COMMENT '二级分类id，类别',
	//  status tinyint(4) NOT NULL COMMENT '状态 0 未归还 1 已归还 2 已丢失 3 已找回',
	// 	record_time timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '录入时间',
	// 	pic_path varchar(1000) DEFAULT NULL COMMENT '物品照片',
	// 	PRIMARY KEY (id)
	// ) COMMENT = '捡拾/丢失物品'
	
	private String id;
	private String fkindId;
	private String skindId;
	private Integer status;
	private Time recordTime;
	private String picPath;
	
	public XObject()
	{
	}
	
	public XObject(String id, String fkindId, String skindId, Integer status, Time recordTime, String picPath)
	{
		this.id = id;
		this.fkindId = fkindId;
		this.skindId = skindId;
		this.status = status;
		this.recordTime = recordTime;
		this.picPath = picPath;
	}
	
	@Override
	public String toString()
	{
		return "XObject{" +
			"id='" + id + '\'' +
			", fkindId='" + fkindId + '\'' +
			", skindId='" + skindId + '\'' +
			", status=" + status +
			", recordTime=" + recordTime +
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
	
	public Integer getStatus()
	{
		return status;
	}
	
	public void setStatus(Integer status)
	{
		this.status = status;
	}
	
	public Time getRecordTime()
	{
		return recordTime;
	}
	
	public void setRecordTime(Time recordTime)
	{
		this.recordTime = recordTime;
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
