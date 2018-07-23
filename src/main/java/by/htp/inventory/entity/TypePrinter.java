package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="typePrinter")
public class TypePrinter extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2409380065963339928L;
	@Column(name="typePrinter")
	private String typePrinter;
	public TypePrinter() {
	}
	public TypePrinter(int id) {
		super(id);
	}
	public TypePrinter(String typePrinter) {
		super();
		this.typePrinter = typePrinter;
	}
	public String getTypePrinter() {
		return typePrinter;
	}
	public void setTypePrinter(String typePrinter) {
		this.typePrinter = typePrinter;
	}
	@Override
	public String toString() {
		return "TypePrinter [typePrinter=" + typePrinter + "]";
	}
	
}
