package com.nespresso.exercises.chainwagon;

import java.util.LinkedList;

import com.nespresso.exercises.chainwagon.wagons.AbstractWagon;
import com.nespresso.exercises.chainwagon.wagons.Fillable;
import com.nespresso.exercises.chainwagon.wagons.HeadWagon;
import com.nespresso.exercises.train.IChainContext;
import com.nespresso.exercises.train.IChainWagon;

class ChainWagon implements IChainWagon {
	
	private static final String LINK_SEPARATOR = "::";
	
	private class ChainContext implements IChainContext{
	    
		private boolean bEmpty = true;
		private boolean bLikable = true;
		
		@Override
		public boolean isEmpty() {
			return bEmpty;
		}

		@Override
		public boolean isLinkable() {
			return bLikable;
		}
		
		// setters, visibility only inside
		void setLinkable(boolean bl){
			this.bLikable = bl;
		}
		
		void setEmpty(boolean be){
			this.bEmpty = be;
		}

	}
	
	
	private ChainContext chainContext = new ChainContext();
	
	
	
	private LinkedList<AbstractWagon> wagonLinkedList = new LinkedList<AbstractWagon>();
	private LinkedList<Fillable> fillableWagonLinkedList = new LinkedList<Fillable>();
	
	@Override
	public IChainContext getChainContext(){
		return (IChainContext) chainContext;
	}
	
	public boolean add(AbstractWagon aw) {
		if(aw == null || ! chainContext.isLinkable())
		  return false;
		
		wagonLinkedList.add(aw);
		if(aw instanceof Fillable){
			Fillable fw = (Fillable) aw;
			if(! fw.isFilled())
			   fillableWagonLinkedList.add((Fillable)aw);
		}
		 
		chainContext.setEmpty(false);
		chainContext.setLinkable(aw.canLinked());
		
		return true;		
	}

	
	@Override
	public String print() {
		if(wagonLinkedList.isEmpty()){
			return "";
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i< wagonLinkedList.size()-1; i++){
			sb.append(wagonLinkedList.get(i).printWagon());
			sb.append(LINK_SEPARATOR);
		}
		sb.append(wagonLinkedList.getLast().printWagon());
		return sb.toString();
	}

	@Override
	public boolean fill() {
		if(fillableWagonLinkedList.isEmpty())
		  return false;
		
		Fillable fw = fillableWagonLinkedList.getFirst();
		if(fw.fillWagon()){
			fillableWagonLinkedList.removeFirst();
			return true;
		}
		return false;
		
	}

	@Override
	public boolean detachEnd() {
		if(wagonLinkedList.getLast() instanceof HeadWagon){
			AbstractWagon removedWagon = wagonLinkedList.removeLast();
			if(removedWagon instanceof Fillable){
				fillableWagonLinkedList.remove(removedWagon);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean detachHead() {
		if(wagonLinkedList.getFirst() instanceof HeadWagon){
			AbstractWagon removedWagon = wagonLinkedList.removeFirst();
			if(removedWagon instanceof Fillable){
				fillableWagonLinkedList.remove(removedWagon);
			}
			return true;
		}
		return false;
	}
}
