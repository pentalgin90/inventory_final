package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sdd")
public class Ssd extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3492307628476199484L;
	@Column(name="ssd")
	private String sdd;
	public Ssd() {
	}
	public Ssd(int id) {
		super(id);
	}
	public Ssd(String sdd) {
		super();
		this.sdd = sdd;
	}
	public String getSdd() {
		return sdd;
	}
	public void setSdd(String sdd) {
		this.sdd = sdd;
	}
	@Override
	public String toString() {
		return "Sdd [sdd=" + sdd + "]";
	}
	
}
