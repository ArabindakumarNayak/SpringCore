package com.springcore.stereotype;

public class Teacher {
	private String tId;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String gettId() {
		return tId;
	}

	public void settId(String tId) { 
		this.tId = tId;
	}

	@Override
	public String toString() {
		return "Teacher [tId=" + tId + "]";
	}

}
