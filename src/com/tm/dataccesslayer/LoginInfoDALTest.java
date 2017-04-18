package com.tm.dataccesslayer;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginInfoDALTest {
LoginInfoDAL lid=new LoginInfoDAL();
	@Test
	public void testGetLoginInfo() throws Exception {
		assertEquals(true,lid.getLoginInfo("nishant", "nishant"));
	}

}
