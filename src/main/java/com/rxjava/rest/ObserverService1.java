package com.rxjava.rest;

import rx.Observer;

public abstract class ObserverService1 implements Observer<String> {

	@Override
	public void onCompleted() {
		 System.out.println("JUST OPERATOR - ON COMPELTE");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onError(Throwable e) {
		System.out.println("JUST OPERATOR - ON ERR");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNext(String t) {
		System.out.println("JUST OPERATOR - ON NEXT");
		// TODO Auto-generated method stub
		
	}

}
