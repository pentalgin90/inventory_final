package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="equipment")
public class Monitor extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5680565152761058424L;
	@Column(name="inventaryId")
	private String inventaryId;
	
	@Column(name="model")
	private String model;
	
	@Column(name="inputDoc")
	private String inputDoc;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="brand")
	private Brand brand;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="type")
	private Type type;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="diagonal")
	private Diagonal diagonal;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="firstName")
	private User user;

	public Monitor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monitor(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Monitor(String inventaryId, String model, String inputDoc, Brand brand, Type type, Diagonal diagonal,
			User user) {
		super();
		this.inventaryId = inventaryId;
		this.model = model;
		this.inputDoc = inputDoc;
		this.brand = brand;
		this.type = type;
		this.diagonal = diagonal;
		this.user = user;
	}

	public String getInventaryId() {
		return inventaryId;
	}

	public void setInventaryId(String inventaryId) {
		this.inventaryId = inventaryId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getInputDoc() {
		return inputDoc;
	}

	public void setInputDoc(String inputDoc) {
		this.inputDoc = inputDoc;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Diagonal getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(Diagonal diagonal) {
		this.diagonal = diagonal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Monitor [inventaryId=" + inventaryId + ", model=" + model + ", inputDoc=" + inputDoc + ", brand="
				+ brand + ", type=" + type + ", diagonal=" + diagonal + ", user=" + user + "]";
	}
	
}
