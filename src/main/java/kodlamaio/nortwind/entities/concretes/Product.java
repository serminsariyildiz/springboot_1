package kodlamaio.nortwind.entities.concretes;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data

@Entity
@Table(name = "products")

public class Product {
	
	@Id
	@GeneratedValue
	
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryid;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnıt;
	
	public Product(int id, int categoryid, String productName, double unitPrice, short unitsInStock, String quantityPerUnıt) {
		super();
		this.id = id;
		this.categoryid = categoryid;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnıt = quantityPerUnıt;
	}
	
	public Product() {
		
	}
}
