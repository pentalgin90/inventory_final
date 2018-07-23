package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gpu")
public class Gpu extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7162500833494492682L;
	@Column(name="gpu")
	private String gpu;
	public Gpu() {
	}
	public Gpu(int id) {
		super(id);
	}
	public Gpu(String gpu) {
		super();
		this.gpu = gpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	@Override
	public String toString() {
		return "Gpu [gpu=" + gpu + "]";
	}
	

}
