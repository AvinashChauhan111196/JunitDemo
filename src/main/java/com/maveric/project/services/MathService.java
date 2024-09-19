package com.maveric.project.services;

import com.maveric.project.exceptions.InvalidRangeException;

public interface MathService {

	public int add(int n1, int n2) throws InvalidRangeException;
	
	public int sub(int n1, int n2) throws InvalidRangeException;
	
	public int mult(int n1, int n2) throws InvalidRangeException;
	
	public int div(int n1, int n2) throws InvalidRangeException;
}
