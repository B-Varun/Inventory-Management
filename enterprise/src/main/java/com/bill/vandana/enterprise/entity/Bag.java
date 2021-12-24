package com.bill.vandana.enterprise.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bag {

	@Id
	private int id;
	
	private String name, model, modelNo;
	private float costPrice,sellingPrice;
	private int mrp;
	
	//No-arg constructor required for JPA
	public Bag() {}

	public Bag(int id, String name, String model, String modelNo, float costPrice, float sellingPrice, int mrp) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.modelNo = modelNo;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.mrp = mrp;
	}

	//   Getters and setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public float getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getMrp() {
		return mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	@Override
	public String toString() {
		return "Bag [id=" + id + ", name=" + name + ", model=" + model + ", modelNo=" + modelNo + ", costPrice="
				+ costPrice + ", sellingPrice=" + sellingPrice + ", mrp=" + mrp + "]";
	}

	
	
}
