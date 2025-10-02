package com.exampel.work_with_properties;

import com.exampel.work_with_properties.config.props.DealerShipProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class WorkWithPropertiesApplication {


    @Autowired
    DealerShipProperties dealerShipProperties;

	public static void main(String[] args) {
		SpringApplication.run(WorkWithPropertiesApplication.class, args);
	}

    @EventListener(ApplicationReadyEvent.class)
    public void onReady(){
        System.out.println("Name: " + dealerShipProperties.getName());
        System.out.println("Cars: " + dealerShipProperties.getCars());
//        System.out.println("Workers: " + dealerShipProperties.getWorkers());
        System.out.println("Address: " + dealerShipProperties.getAddress());
        //new line2
    }

}
