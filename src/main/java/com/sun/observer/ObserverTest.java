package com.sun.observer;

import com.google.common.eventbus.EventBus;

public class ObserverTest {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus();  
		eventBus.register(new Responder("Tom"));
		eventBus.post(new Question("观察者模式原理是什么？"));
	
	}

}
