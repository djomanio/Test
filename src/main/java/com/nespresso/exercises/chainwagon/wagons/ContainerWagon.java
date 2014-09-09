package com.nespresso.exercises.chainwagon.wagons;




public class ContainerWagon extends AbstractWagon implements Fillable{
    
	
	private static String EMPTY_CONTAINER = "|____|";
	private static String FILLED_CONTAINER = "|^^^^|";
	
	public ContainerWagon(){
		this.wagon = EMPTY_CONTAINER;
	}
	
	
	
	@Override
	public boolean canLinked() {
		return true;
	}
	
	
	@Override
	public boolean fillWagon() {
		boolean bempty = ! isFilled();
		if(bempty){
			this.wagon = FILLED_CONTAINER;
		}
		return bempty;
	}

	@Override
	public boolean isFilled() {
		// TODO Auto-generated method stub
		return FILLED_CONTAINER.equals(this.wagon);
	}
	
}
