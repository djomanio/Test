package com.nespresso.exercises.chainwagon.wagons;



public class RestauWagon extends AbstractWagon {
    
	public RestauWagon(){
		this.wagon = "|hThT|";
	}

	@Override
	public boolean canLinked() {
		return true;
	}

}
