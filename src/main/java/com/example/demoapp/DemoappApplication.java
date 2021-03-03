package com.example.demoapp;

import com.example.demoapp.entity.Customer;
import com.example.demoapp.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
@Slf4j
public class DemoappApplication {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DemoappApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        List allCustomers = this.repository.findAll();
        log.info("Number of customers: " + allCustomers.size());

        Customer newCustomer = new Customer();
        newCustomer.setFirstName("John");
        newCustomer.setLastName("Doe");
        log.info("Saving new customer...");
        this.repository.save(newCustomer);

        allCustomers = this.repository.findAll();
        log.info("Number of customers: " + allCustomers.size());
    }
}
