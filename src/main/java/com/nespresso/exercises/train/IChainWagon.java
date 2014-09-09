package com.nespresso.exercises.train;



public interface IChainWagon {
	
	public IChainContext getChainContext();
     
	public String print();
	
	public boolean fill();
	
	public boolean detachEnd();
	
	public boolean detachHead();
}
