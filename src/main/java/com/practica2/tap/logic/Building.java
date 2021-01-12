package com.practica2.tap.logic;

import java.util.ArrayList;

public class Building {
	
	private ArrayList<Floor> floors;
	private ArrayList<Elevator> elevator;
	
	public Building(ArrayList<Floor> floors, ArrayList<Elevator> elevator) {
		super();
		this.floors = floors;
		this.elevator = elevator;
	}
	public Building(int numFloors, int numElevators) {
		
		this.floors= new ArrayList<Floor>();
		this.elevator= new ArrayList<Elevator>();
		
		for(int i=0; i<numFloors;i++) {
			
			this.floors.add(new Floor(i));
			
		}
		
		for(int i=0; i< numElevators;i++) {
			
			this.elevator.add(new Elevator(i));
		}
	}
	
	
}
