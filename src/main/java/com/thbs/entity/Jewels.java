package com.thbs.entity;

import javax.persistence.*;

@Entity
@Table(name="jewels")
//@NamedQuery(name="jewellery",query="select * from jewels where jewel_metal=gold");
public class Jewels {
	public Jewels() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jewel_id;
	private String jewel_metal;
	private String jewel_type;
	private int weight;
	private double price;
	public String getJewel_metal() {
		return jewel_metal;
	}
	public void setJewel_metal(String jewel_metal) {
		this.jewel_metal = jewel_metal;
	}
	public String getJewel_type() {
		return jewel_type;
	}
	public void setJewel_type(String jewel_type) {
		this.jewel_type = jewel_type;
	}
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
		return "Jewels [jewel_id=" + jewel_id + ", jewel_metal=" + jewel_metal + ", jewel_type=" + jewel_type
				+ ", weight=" + weight + ", price=" + price + "]";
	}
	public int getJewel_id() {
		return jewel_id;
	}
	public void setJewel_id(int jewel_id) {
		this.jewel_id = jewel_id;
	}
	
	
	
	

}
