package com.bill.vandana.enterprise.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pillow {

	@Id
	private int id;
	
	private String type,model,modelNo;
	private float costPrice,sellingPrice;
	private int mrp;
	
	/**
	 *   No-arg constructor required for Spring JPA 
	 */
	protected Pillow() {}

	public Pillow(int id, String type, String model, String modelNo, float costPrice, float sellingPrice, int mrp) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
		this.modelNo = modelNo;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.mrp = mrp;
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public String getModelNo() {
		return modelNo;
	}

	public float getCostPrice() {
		return costPrice;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public int getMrp() {
		return mrp;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	@Override
	public String toString() {
		return "Pillow [id=" + id + ", type=" + type + ", model=" + model + ", modelNo=" + modelNo + ", costPrice="
				+ costPrice + ", sellingPrice=" + sellingPrice + ", mrp=" + mrp + "]";
	}
	
	
}
