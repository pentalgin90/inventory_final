package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class Brand extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2480128048825428876L;
	@Column(name="brand")
	private String brand;
	public Brand() {
	}

	public Brand(int id) {
		super(id);
	}

	public Brand(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Brand [brand=" + brand + "]";
	}
	
	
}
