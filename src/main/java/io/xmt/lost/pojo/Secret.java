package io.xmt.lost.pojo;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class Secret
{
	// CREATE TABLE secrets (
	// 	id varchar(32) NOT NULL COMMENT 'id',
	// 	question varchar(1000) NOT NULL COMMENT '密保问题',
	// 	PRIMARY KEY (id)
	// ) COMMENT = '密保问题列表'
	
	private String id;
	private String question;
	
	public Secret()
	{
	}
	
	public Secret(String id, String question)
	{
		this.id = id;
		this.question = question;
	}
	
	@Override
	public String toString()
	{
		return "Secret{" +
			"id='" + id + '\'' +
			", question='" + question + '\'' +
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
	
	public String getQuestion()
	{
		return question;
	}
	
	public void setQuestion(String question)
	{
		this.question = question;
	}
}
