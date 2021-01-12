package com.practica2.tap.logic;

import java.util.ArrayList;

public class Elevator {
    protected int current_floor;
    protected ArrayList<Integer> call_list;
    protected ElevatorState current_state;

    public Elevator() {
        this.current_floor = 0;
        this.call_list = new ArrayList<Integer>();
        this.current_state = new DoorClosedState();
    }

    public String select_floor(int floor_num) {
        this.call_list.add(floor_num);
        
        return this.move_elevator();
    }

    public String move_elevator() {
        return this.current_state.move_elevator(this);
    }

    public String doors_button() {
        return this.current_state.doors_button(this);
    }

    public void emergency_button() {
        this.current_state.emergency_button(this);
    }

    public ArrayList<Integer> getCall_list() {
        return this.call_list;
    }

    public int getCurrentFloor() {
        return current_floor;
    }

    public void setCurrentFloor(int floor_num) {
        this.current_floor = floor_num;
    }

    public void setCurrent_state(ElevatorState state) {
        this.current_state = state;
    } 
}
