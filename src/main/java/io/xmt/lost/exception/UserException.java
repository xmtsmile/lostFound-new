package io.xmt.lost.exception;

/**
 * @Author fisheax
 * @Date 3/19/2017
 */
public class UserException extends RuntimeException
{
	public UserException()
	{
		super();
	}
	
	public UserException(String message)
	{
		super(message);
	}
}
