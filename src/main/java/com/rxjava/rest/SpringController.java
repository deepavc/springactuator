package com.rxjava.rest;



import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rx.Observable;
import rx.Observer;
import rx.Subscription;

@RestController
public class SpringController {
	
	@GetMapping("/rxjava/just")
	public String justoperator() {
		System.out.println("JUST OPERATOR - ENTRY");
		
		 final StringBuilder result = new StringBuilder();
	        Observable<String> observer = Observable.just("Hello", "World"); // provides datea
	        observer.subscribe(s ->
	        {
	        	System.out.println("JUST OPERATOR - SUBSCRIBE ENTRY");
	        	result.append(s).append(" "); // Callable as subscriber
	        	System.out.println("JUST OPERATOR - SUBSCRIBE END");
	        
	        });
	        System.out.println("JUST OPERATOR - END");
	        return result.toString().trim();
		
	}

	

}
