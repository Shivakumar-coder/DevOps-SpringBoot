package com.thbs.entity;

public class Item {
	private int weight;
	private double price;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [weight=" + weight + ", price=" + price + "]";
	}
	
	
	

}
