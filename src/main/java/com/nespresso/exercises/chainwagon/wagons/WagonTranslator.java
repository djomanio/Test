package com.nespresso.exercises.chainwagon.wagons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WagonTranslator {
	
	private static String HEAD_ERROR = ".+H.*H.+";
	
	private static final Map<String,WagonType> MAPPING = new HashMap<String,WagonType>();
 
	static {
		for(WagonType wt : WagonType.values()){	
			MAPPING.put(wt.getCodeWagon(), wt);
		}
	}
	
	
	public static List<WagonType> transCode(String cw){
		List<WagonType> wtList = new ArrayList<WagonType>();
		if(cw == null || cw.isEmpty()){
		    return wtList;
		}

        if(cw.matches(HEAD_ERROR)){
        	System.out.println("[INFO] : Code de structure erroné, possède des headers au milieu");
        	return wtList;
        }
        	
        String[] codes = cw.split("(?!^)");
        WagonType wt = null;
        for(int i=0; i<codes.length; i++){
        	wt = MAPPING.get(codes[i]);
        	if(wt != null){
        		wtList.add(wt);
        	}else{
        		System.out.println("[INFO] : Code de structure erroné, contient un caractére hors l'ensemble "+ MAPPING.keySet().toString());
        		wtList.clear();
        		break;
        	}
        }
		
		return wtList;
	}

}
