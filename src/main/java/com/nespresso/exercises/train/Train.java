package com.nespresso.exercises.train;

import com.nespresso.exercises.chainwagon.ChainWagonFactory;

public class Train {
	private IChainWagon iChainWagon = null;
	
	
	public Train(String structure) {
		iChainWagon = ChainWagonFactory.newChainWagon(structure);
	}

	public String print(){
		return iChainWagon.print();
	}

	public void detachEnd(){
		iChainWagon.detachEnd();
	}

	public void detachHead(){
		iChainWagon.detachHead();
	}

	public boolean fill(){
        return iChainWagon.fill();
	}
}
