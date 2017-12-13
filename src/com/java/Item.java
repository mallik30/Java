package com.java;

public class Item implements Cloneable{

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

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {

		return "Id : "+id+"\nName : "+name+"\nPrice : "+price;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Item item2 = (Item)obj; 
		
		if(item2 != null) {
			if(this.id == item2.id && this.name.equals(item2.name) && this.price == item2.price) {
				return true;
			}
		}	
		return false;
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
