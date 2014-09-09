package com.nespresso.exercises.chainwagon;

import java.util.List;

import com.nespresso.exercises.chainwagon.wagons.AbstractWagon;
import com.nespresso.exercises.chainwagon.wagons.WagonFactory;
import com.nespresso.exercises.chainwagon.wagons.WagonTranslator;
import com.nespresso.exercises.chainwagon.wagons.WagonType;
import com.nespresso.exercises.train.IChainWagon;

public class ChainWagonFactory {
	
	private ChainWagonFactory(){}
	
	
	public static IChainWagon newChainWagon(String structure){
		List<WagonType> wtList = WagonTranslator.transCode(structure);
		ChainWagon chainWagon = new ChainWagon();
		AbstractWagon aw = null;
		for(WagonType wt : wtList){
			aw = WagonFactory.newWagon(wt, chainWagon.getChainContext());
		    if(!chainWagon.add(aw)){
		    	System.out.println("[INFO] :  impossible d'instancier un Objet ChainWagon à partir de la structure  : " + structure);
		    	return new NullChainWagon();
		    } 
		}
		
		return chainWagon;
	}
	
	
	
	
	
	
	
	
	

}
