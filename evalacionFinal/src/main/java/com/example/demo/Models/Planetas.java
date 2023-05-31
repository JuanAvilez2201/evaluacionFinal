package com.example.demo.Models;

public class Planetas {
	private int UA;
	private int id;
	private int milesk;
	private String Ceres;
	
	public Planetas() {
		
	}
	public Planetas(int uA, int id, int milesk, String ceres) {
		super();
		UA = uA;
		this.id = id;
		this.milesk = milesk;
		Ceres = ceres;
	}
	public int getUA() {
		return UA;
	}
	public void setUA(int uA) {
		UA = uA;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMilesk() {
		return milesk;
	}
	public void setMilesk(int milesk) {
		this.milesk = milesk;
	}
	public String getCeres() {
		return Ceres;
	}
	public void setCeres(String ceres) {
		Ceres = ceres;
	}
	
	
	
	
}
