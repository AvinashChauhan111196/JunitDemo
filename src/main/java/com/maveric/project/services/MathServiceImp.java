package com.maveric.project.services;

import com.maveric.project.exceptions.InvalidRangeException;

public class MathServiceImp implements MathService {

	@Override
	public int add(int n1, int n2) throws InvalidRangeException {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public int sub(int n1, int n2) throws InvalidRangeException {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public int mult(int n1, int n2) throws InvalidRangeException {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	@Override
	public int div(int n1, int n2) throws InvalidRangeException {
		// TODO Auto-generated method stub
		return n1/n2;
	}



}
