package com.practica2.tap.logic;
import java.util.ArrayList;

public class Display {
	
	private int pisoActual;
	
	private ArrayList<Observer> observers;
	
	public void MostrarPisoAscensor(int pisoActual) {
		
		System.out.println("Ascensor "+"en piso "+ pisoActual);
	}
	
	public void attachObserver(Observer o) {
		
		this.observers.add(o);
		
		
	}
	
	public void deleteObserver(Observer o) {
		
		this.observers.remove(o);
	}
	public void notifyObserverAscensor1() {
		
		for(Observer o : this.observers) {
			
			
			o.updateAscensor1(pisoActual);
			
		}
	}
	public void notifyObserverAscensor2() {
		
		for(Observer o : this.observers) {
			
			
			o.updatAscensor2(pisoActual);
			
		}
		
	}
	public void notifyObserverAscensor3() {
		
		for(Observer o : this.observers) {
			
			o.uptadeAscensor3(pisoActual);
		}
	}

}
