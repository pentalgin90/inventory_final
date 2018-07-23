package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cpu")
public class Cpu extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6750122072367190893L;
	@Column(name="cpu")
	private String cpu;
	public Cpu() {
	}
	public Cpu(int id) {
		super(id);
	}
	public Cpu(String cpu) {
		super();
		this.cpu = cpu;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "Cpu [cpu=" + cpu + "]";
	}
	
}
