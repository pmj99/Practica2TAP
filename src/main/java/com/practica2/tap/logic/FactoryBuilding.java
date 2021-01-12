package com.practica2.tap.logic;

public class FactoryBuilding {

	public static Building getBuilding(String type) {
		if (type.contentEquals("Ascensor")) {
			return new Elevator();
		}
		else {
			return new Planta();
		}
	}
}
