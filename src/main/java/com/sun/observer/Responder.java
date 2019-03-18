package com.sun.observer;

import com.google.common.eventbus.Subscribe;

public class Responder {
	 
	private String name;
	
	
	
    public Responder(String name) {
		super();
		this.name = name;
	}



	@Subscribe  
    public void subscribe(Question question) {  
        System.out.printf("问题: %s\n回复人:%s",question.getContent(),name);  
    }  
	
}
