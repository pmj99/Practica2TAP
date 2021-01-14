package com.practica2.tap.logic;

import java.util.ArrayList;

public class Building {
	protected ArrayList<Floor> floors;
	protected ArrayList<Elevator> elevators;
	
	public Building(ArrayList<Floor> floors, ArrayList<Elevator> elevators) {
		super();
		this.floors = floors;
		this.elevators = elevators;
	}

	public Building(int numFloors, int numElevators) {
		this.floors= new ArrayList<Floor>();
		this.elevators = new ArrayList<Elevator>();
		
		for (int i = 0; i < numFloors; i++) {
			this.floors.add(new Floor(i));
		}
		
		for (int i = 0; i < numElevators; i++) {
			this.elevators.add(new Elevator(i));
		}
	}
	
	public ArrayList<Floor> getFloors() {
		return floors;
	}

	public ArrayList<Elevator> getElevators() {
		return elevators;
	}
}
