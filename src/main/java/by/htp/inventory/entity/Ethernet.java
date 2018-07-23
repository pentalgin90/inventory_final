package by.htp.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ethernet")
public class Ethernet extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7812921714734366442L;
	private String ethernet;
	public Ethernet() {
	}
	public Ethernet(int id) {
		super(id);
	}
	public Ethernet(String ethernet) {
		super();
		this.ethernet = ethernet;
	}
	public String getEthernet() {
		return ethernet;
	}
	public void setEthernet(String ethernet) {
		this.ethernet = ethernet;
	}
	@Override
	public String toString() {
		return "Ethernet [ethernet=" + ethernet + "]";
	}
	
}
