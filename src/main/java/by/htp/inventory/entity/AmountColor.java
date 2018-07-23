package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="amountColor")
public class AmountColor extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7750002360466373494L;
	@Column(name="amountColor")
	private String amountColor;
	public AmountColor() {
	}
	public AmountColor(int id) {
		super(id);
	}
	public AmountColor(String amountColor) {
		super();
		this.amountColor = amountColor;
	}
	public String getAmountColor() {
		return amountColor;
	}
	public void setAmountColor(String amountColor) {
		this.amountColor = amountColor;
	}
	@Override
	public String toString() {
		return "AmountColor [amountColor=" + amountColor + "]";
	}
	
	
}
