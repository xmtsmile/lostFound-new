package io.xmt.lost.pojo;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class Kind
{
	// CREATE TABLE kinds (
	// 	id varchar(32) NOT NULL COMMENT 'id',
	// 	name varchar(50) NOT NULL COMMENT '分类名称',
	// 	system tinyint(4) DEFAULT 0 COMMENT '是否系统内置',
	//  level tinyint(4) DEFAULT 0 COMMENT '分类级别',
	// 	PRIMARY KEY (id)
	// ) COMMENT = '分类列表'
	
	private String id;
	private String name;
	private Integer system;
	private Integer level;
	
	public Kind()
	{
	}
	
	public Kind(String id, String name, Integer system, Integer level)
	{
		this.id = id;
		this.name = name;
		this.system = system;
		this.level = level;
	}
	
	@Override
	public String toString()
	{
		return "Kind{" +
			"id='" + id + '\'' +
			", name='" + name + '\'' +
			", system=" + system +
			", level=" + level +
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
	
	public Integer getSystem()
	{
		return system;
	}
	
	public void setSystem(Integer system)
	{
		this.system = system;
	}
	
	public Integer getLevel()
	{
		return level;
	}
	
	public void setLevel(Integer level)
	{
		this.level = level;
	}
}
