package com.java;

public class Item {

	private int id;
	private String name;
	private float price;

	private Bid[] bids;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	
	public Item(int id, String name, float price) {
		setId(id);
		setName(name);
		setPrice(price);
	}

	public void setBids(Bid[] bids) {
		this.bids = bids;
	}
	
	public Bid[] getBids() {
		return bids;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>0) {
			this.id = id;
		}else {
			System.err.println("Invalid id");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	
}
