package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Grocery {
	@Id
	private int productId;
	private String Name;
	private String Unit;
	private int Price;
	private String Life;
	private String Origin;
	private String Description;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getLife() {
		return Life;
	}
	public void setLife(String life) {
		Life = life;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		Origin = origin;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	@Override
	public String toString() {
		return "Grocery [productId=" + productId + ", Name=" + Name + ", Unit=" + Unit + ", Price=" + Price + ", Life="
				+ Life + ", Origin=" + Origin + ", Description=" + Description + "]";
	}
	
	
}


