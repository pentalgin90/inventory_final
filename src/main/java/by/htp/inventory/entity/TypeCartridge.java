package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="typeCartridge")
public class TypeCartridge extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4994956698887287633L;
	@Column(name="typeCartridge")
	private String typeCartridge;
	public TypeCartridge() {
	}
	public TypeCartridge(int id) {
		super(id);
	}
	public TypeCartridge(String typeCartridge) {
		super();
		this.typeCartridge = typeCartridge;
	}
	public String getTypeCartridge() {
		return typeCartridge;
	}
	public void setTypeCartridge(String typeCartridge) {
		this.typeCartridge = typeCartridge;
	}
	@Override
	public String toString() {
		return "typeCartridge [typeCartridge=" + typeCartridge + "]";
	}
	
}
