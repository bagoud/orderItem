package com.orders.order.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	private long orderid;
	private long productcode;
	private String productname;
	private String quantity;
	
	
	  public Item() {
	  
	  }
	 
	
	public Item(long productcode, String productName, String quantity) {
		this.productcode = productcode;
		this.productname = productName;
		this.quantity = quantity;
	}
	
	public long getOrderId() {
		return orderid;
	}

	public void setOrderId(long orderId) {
		this.orderid = orderId;
	}
	
	public long getProductCode() {
		return productcode;
	}
	
	public void setProductCode(long productcode) {
		this.productcode = productcode;
	}
	
	public String getProductName() {
		return productname;
	}
	
	
	public void setProductName(String productName) {
		this.productname = productName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Order Item - " + this.productcode + ", " + this.productname + ", " + this.quantity;
	}
}
