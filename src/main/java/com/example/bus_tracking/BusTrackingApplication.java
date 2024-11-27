package com.example.bus_tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.bus_tracking")
public class BusTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTrackingApplication.class, args);
	}

}
