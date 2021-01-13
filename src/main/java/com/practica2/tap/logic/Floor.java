package com.practica2.tap.logic;

public class Floor  {
	
	private int numFloor;
	
	
	
	public Floor(int numFloor) {
		super();
		this.numFloor = numFloor;
	}
	public int getNumFloor() {
		return numFloor;
	}
	public void setNumFloor(int numFloor) {
		this.numFloor = numFloor;
	}
	public String llamarAscensor(int plantaLlama,Elevator ele) {
		
		
		return ele.select_floor(plantaLlama);
	
	}
	public int  estadoAscensor(Elevator ele) {
		
		return ele.getCurrentFloor();
		
	}
	
	

	
	public String noise(int plantaLlama, Elevator ele) {
		// TODO Auto-generated method stub
		
		String messege = null;
		
		if(plantaLlama == ele.getCurrentFloor()) {
			
			messege="ON";
		}
		return messege;
		
	}

}
