package com.tm.dataccesslayer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tm.entity.UserInfo;

public class RegisterUserTest {

	UserInfo ui=new UserInfo();
	@Test
	public void testRegisterUser() throws Exception {
		
		
		
		assertEquals(1,(new RegisterUser().registerUser(ui)));
		
	}

}
