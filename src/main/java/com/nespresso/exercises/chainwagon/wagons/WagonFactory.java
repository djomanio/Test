package com.nespresso.exercises.chainwagon.wagons;

import com.nespresso.exercises.train.IChainContext;

public class WagonFactory {
	
	private WagonFactory(){};
	
	public static AbstractWagon newWagon(WagonType wt, IChainContext iChainContext){
		switch (wt) {
		   case HEAD : return new HeadWagon(iChainContext);
		   case PASSENGER : return new PassengerWagon();
		   case RESTAU : return new RestauWagon();
		   case CONTAINER : return new ContainerWagon();
		   default : {
			   System.out.println("[INFO] : impossible d'instancier un Objet Wagon à partir du type : " + wt.name());
			   return null;
		   }
	    }
	}

}
