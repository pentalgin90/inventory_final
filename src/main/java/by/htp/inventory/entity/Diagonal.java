package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="diagonal")
public class Diagonal extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3727888134224389482L;
	@Column(name="diagonal")
	private String diagonal;
	public Diagonal() {
		super();
	}
	public Diagonal(int id) {
		super(id);
	}
	public Diagonal(String diagonal) {
		super();
		this.diagonal = diagonal;
	}
	public String getDiagonal() {
		return diagonal;
	}
	public void setDiagonal(String diagonal) {
		this.diagonal = diagonal;
	}
	@Override
	public String toString() {
		return "Diagonal [diagonal=" + diagonal + "]";
	}
	
}
