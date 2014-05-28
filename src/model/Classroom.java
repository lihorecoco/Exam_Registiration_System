package model;

import java.util.ArrayList;

public class Classroom {

	private String name;
	private int capacity;
	private int floor;
	
	public Classroom(String name, int capacity, int floor) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.floor = floor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	} 
	
	
	
	
	
	
}

	