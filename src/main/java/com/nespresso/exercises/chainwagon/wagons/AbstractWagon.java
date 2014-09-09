package com.nespresso.exercises.chainwagon.wagons;


public abstract class AbstractWagon {
	
	protected String wagon;
    
    final public String    printWagon(){
    	return wagon;
    }
    
    public abstract boolean canLinked();
}
