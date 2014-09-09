package com.nespresso.exercises.chainwagon.wagons;



public class PassengerWagon extends AbstractWagon {
   
	public PassengerWagon(){
		this.wagon = "|OOOO|";
	}

	@Override
	public boolean canLinked() {
		return true;
	}

}
