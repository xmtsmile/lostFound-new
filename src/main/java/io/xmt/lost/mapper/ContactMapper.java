package io.xmt.lost.mapper;

import io.xmt.lost.pojo.Contact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author fisheax
 * @Date 3/20/2017
 */
public interface ContactMapper
{
	int addContact(Contact contact);
	
	int modifyContact(Contact contact);
	
	int deleteContacts(@Param("contactIds") List<String> contactIds);
}
