package com.maveric.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.maveric.project.exceptions.InvalidRangeException;
import com.maveric.project.services.MathService;
import com.maveric.project.services.MathServiceImp;


public class MathServiceTest {

	private static MathService mathservice;
	@BeforeAll
	public static void setUpEnv() {
		mathservice = new MathServiceImp();
		
	}
	
	@Test
	@DisplayName("Mathservice add service for first number negative")
	public void test1(){
		Assertions.assertThrows(InvalidRangeException.class, ()->mathservice.add(-10, 12));
	}
	
	@Test
	@DisplayName("Mathservice sub service ")
	public void test3(){
		Assertions.assertThrows(InvalidRangeException.class, ()->mathservice.sub(20, 12));
	}
	
	@Test
	@DisplayName("Mathservice mult service ")
	public void test4(){
		Assertions.assertThrows(InvalidRangeException.class, ()->mathservice.mult(10, 12));
	}
	
	@Test
	@DisplayName("Mathservice div service ")
	public void test5(){
		Assertions.assertThrows(InvalidRangeException.class, ()->mathservice.div(10, 2));
	}
	
	@Test
	@DisplayName("Mathservice add service for both positive")
	public void test2() throws InvalidRangeException {
		int n1=10, n2=20;
		int expectedans = 30;
		Assertions.assertEquals(expectedans, mathservice.add(10, 20));
	}
	
	@AfterAll
	public static void tearDownEnv(){
		System.out.println("tearDownEnV");
	}
}
