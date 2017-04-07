package io.xmt.lost.util;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class Response
{
	private int code;
	private String msg;
	private Object result;
	
	public static Response success()
	{
		return new Response(0, "success", null);
	}
	
	public static Response success(String msg)
	{
		return new Response(0, msg, null);
	}
	
	public static Response failed(int code, String msg)
	{
		return new Response(code, msg, null);
	}
	
	public static Response failed(int code)
	{
		return failed(code, "failed");
	}
	
	// ================================================================================================
	
	public int code()
	{
		return this.code;
	}
	
	public Response code(int code)
	{
		this.code = code;
		return this;
	}
	
	public String msg()
	{
		return this.msg;
	}
	
	public Response msg(String msg)
	{
		this.msg = msg;
		return this;
	}
	
	public Object result()
	{
		return this.result;
	}
	
	public Response result(Object result)
	{
		this.result = result;
		return this;
	}
	
	// ================================================================================================
	
	public Response()
	{
	}
	
	public Response(int code, String msg, Object result)
	{
		this.code = code;
		this.msg = msg;
		this.result = result;
	}
	
	@Override
	public String toString()
	{
		return "Response{" +
			"code=" + code +
			", msg='" + msg + '\'' +
			", result=" + result +
			'}';
	}
	
	public int getCode()
	{
		return code;
	}
	
	public void setCode(int code)
	{
		this.code = code;
	}
	
	public String getMsg()
	{
		return msg;
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
	
	public Object getResult()
	{
		return result;
	}
	
	public void setResult(Object result)
	{
		this.result = result;
	}
}
