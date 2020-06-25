package com.orders.order.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.orders.order.model.Item;
import com.orders.order.repository.ItemRepository;

@RestController
@RequestMapping("orders")
public class ItemController {
	
	@Autowired
	ItemRepository repository;

	
	@GetMapping(value = "item/{orderId}")
	public List<Item> getItems(@PathVariable String orderId) {
		return repository.findbyIdNative(Long.valueOf(orderId));
	}
	
	@PostMapping("item")
	public ResponseEntity<Void> createItem(@RequestBody List<Item> items) {
		boolean newItem = repository.addItem(items);
		
		if(!newItem) {
			//return new 
		}
		
		/*
		 * HttpHeaders headers = new HttpHeaders();
		 * headers.setLocation(builder.path("item/{productCode}").buildAndExpand(items.
		 * get(0).getOrderId()).toUri());
		 */
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	/*
	 * @PutMapping(value = "item") public ResponseEntity<Item>
	 * updateItem(@RequestBody Item item) { repository.updateItem(item); return new
	 * ResponseEntity<Item>(item, HttpStatus.OK); }
	 * 
	 * @DeleteMapping(value = "item/{productCode}") public ResponseEntity<Void>
	 * deleteItem(@PathVariable String productCode) {
	 * repository.deleteItem(Long.valueOf(productCode)); return new
	 * ResponseEntity<Void>(HttpStatus.NO_CONTENT); }
	 */
	
}
