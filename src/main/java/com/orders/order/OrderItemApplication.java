package com.orders.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.orders.order.repository.ItemRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderItemApplication implements CommandLineRunner{
	
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ItemRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OrderItemApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		logger.info("Items -> {}", repository.findbyId(1000L));
	}

}
