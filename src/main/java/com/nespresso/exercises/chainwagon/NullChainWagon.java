package com.nespresso.exercises.chainwagon;

import com.nespresso.exercises.train.IChainContext;
import com.nespresso.exercises.train.IChainWagon;

public class NullChainWagon implements IChainWagon {

	@Override
	public IChainContext getChainContext() {
		return null;
	}

	@Override
	public String print() {
		System.out.println("[INFO] : NullChainWagon : print() neutre operation");
		return null;
	}

	@Override
	public boolean fill() {
		System.out.println("[INFO] : NullChainWagon : fill() neutre operation");
		return false;
	}

	@Override
	public boolean detachEnd() {
		System.out.println("[INFO] : NullChainWagon : detachEnd() neutre operation");
		return false;
	}

	@Override
	public boolean detachHead() {
		System.out.println("[INFO] : NullChainWagon : detachHead() neutre operation");
		return false;
	}

}
