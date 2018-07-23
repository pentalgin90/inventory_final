package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ram")
public class Ram extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4171231360253026996L;
	@Column(name="ram")
	private String ram;
	public Ram() {
	}
	public Ram(int id) {
		super(id);
	}
	public Ram(String ram) {
		super();
		this.ram = ram;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Ram [ram=" + ram + "]";
	}
	

}
