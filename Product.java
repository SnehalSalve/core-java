package com.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_product")
public class Product {

	@Id
	@Column(name="product_id")
	private int product_id;
	@Column(name="product_name")
	private String product_name;
	@Column(name="product_price")
	private float product_price;
	@Column(name="product_validity")
	private String product_validity;
	@Column(name="product_quantity")
	private String product_quantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, String product_name, float product_price, String product_validity,
			String product_quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_validity = product_validity;
		this.product_quantity = product_quantity;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public String getProduct_validity() {
		return product_validity;
	}
	public void setProduct_validity(String product_validity) {
		this.product_validity = product_validity;
	}
	public String getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(String product_quantity) {
		this.product_quantity = product_quantity;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_validity=" + product_validity + ", product_quantity=" + product_quantity
				+ "]";
	}
	
	
}
