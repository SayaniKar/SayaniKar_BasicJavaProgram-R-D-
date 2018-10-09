package com.capgemini.Stream.StreamCollectionExamples;

public class Product {
	int price;
	String name;
	public Product(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + "]";
	}
	

}
