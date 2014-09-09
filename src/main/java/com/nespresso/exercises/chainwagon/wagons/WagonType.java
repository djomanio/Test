package com.nespresso.exercises.chainwagon.wagons;


public enum WagonType {
	
	HEAD("H"), PASSENGER("P"), RESTAU("R"), CONTAINER("C"); 
	
	 
	
	private String codeWagon;
	
	public String getCodeWagon(){
		return codeWagon;
	}
	
	private WagonType(String cw){
		this.codeWagon = cw;
	}
}
