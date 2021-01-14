package com.practica2.tap.logic;

public class Floor {
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

	public String llamarAscensor(int plantaLlama, Elevator elevator) {
		return elevator.select_floor(plantaLlama);
	}

	public int estadoAscensor(Elevator elevator) {
		return elevator.getCurrentFloor();
	}
	
	public String noise(int plantaLlama, Elevator elevator) {
		String message = "OFF";
		
		if (plantaLlama == elevator.getCurrentFloor()) {
			message = "ON";
		}

		return message;
	}
}
