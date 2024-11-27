package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Demo {
	@Value("10")
	private int x;
	@Value("20")
	private int y;
	
	@Value("#{ T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{ T(java.lang.Math).E}")
	private double e;

	
	@Value("#{@demo.x+@demo.y}")
	int sum;

//	@PostConstruct
//	public void calculateSum() {
//		this.sum = this.x + this.y;
//	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", pi=" + pi + ", e=" + e + ", sum=" + sum + "]";
	}


}
