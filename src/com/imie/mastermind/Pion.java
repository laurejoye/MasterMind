package com.imie.mastermind;

public class Pion {
	//*** variables
	private int color;
	
	//** CONSTRUCTEUR
	public Pion(int color){
		this.color=color;
	}
	
	public Pion (){
	
	}
	
	
	public String toString() {
		return Integer.toString(color);
	}

	//** METHODE : GETTERS AND SETTERS
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	
}