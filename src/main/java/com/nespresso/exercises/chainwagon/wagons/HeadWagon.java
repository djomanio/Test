package com.nespresso.exercises.chainwagon.wagons;

import com.nespresso.exercises.train.IChainContext;



public class HeadWagon extends AbstractWagon {
	
	private static String HEAD_START = "<HHHH";
	private static String HEAD_END = "HHHH>";
	
	public HeadWagon(){
		this.wagon = HEAD_START;
	}
	
	public HeadWagon(IChainContext chainContext){
		
		this();
		if(chainContext != null && ! chainContext.isEmpty()){
			this.wagon = HEAD_END;	
		}
	}

	@Override
	public boolean canLinked() {
		// TODO Auto-generated method stub
		return HEAD_START.equals(this.wagon);
	}

}
