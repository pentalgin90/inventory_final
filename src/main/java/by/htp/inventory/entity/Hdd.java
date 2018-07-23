package by.htp.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="hdd")
public class Hdd extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -845484283962275077L;
	private String hdd;
	public Hdd() {
	}
	public Hdd(int id) {
		super(id);
	}
	public Hdd(String hdd) {
		super();
		this.hdd = hdd;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	@Override
	public String toString() {
		return "Hdd [hdd=" + hdd + "]";
	}
	
}
