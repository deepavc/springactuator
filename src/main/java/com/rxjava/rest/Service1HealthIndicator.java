package com.rxjava.rest;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.health.Health.Builder;

@Component
public class Service1HealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		
		int errorCode = 0 ;
		
		if(errorCode != 0) {
			return Health.outOfService().build();
		}
		// TODO Auto-generated method stub
		Builder builder = Health.outOfService();
		builder.status("under maintenance").status("400").withDetail("msg", "localhost is under maintainence");
		return builder.build();
		//return Health.up().status("localhost is up and running.").build();
	}

}
