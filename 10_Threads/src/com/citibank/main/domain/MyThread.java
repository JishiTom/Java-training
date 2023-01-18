package com.citibank.main.domain;

public class MyThread implements Runnable{
	private Resource resource;
	private String textMesssage;
	

	public MyThread(Resource resource, String textMesssage) {
		super();
		this.resource = resource;
		this.textMesssage = textMesssage;
	}

	@Override
	public void run() {
		resource.message(textMesssage);
		
	}

}
