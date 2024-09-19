package com.maveric.project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
 
	@BeforeAll
	public static void setUpEnv()
	{
		System.out.println("setUPEnv()");
	}
	
	@BeforeEach
	public void setUpTestMockData()
	{
		System.out.println("setUpTestMockData()");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("test1()");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("test2()");
	
	}
		
	@AfterEach
	public void tearDownTestMockData()
	{
		System.out.println("tearDownTestMockData()");
	}
		
	@AfterAll
	public static void tearDownEnv()
	{
		System.out.println("tearDownEnv()");
	}
}
