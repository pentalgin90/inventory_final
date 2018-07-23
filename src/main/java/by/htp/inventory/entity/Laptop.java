package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="equipment")
public class Laptop extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7792799617782515107L;
	@Column(name="inventoryId")
	private String inventoryId;
	
	@Column(name="model")
	private String model;
	
	@Column(name="inputDoc")
	private String inputDoc;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="brand")
	private Brand brand;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToMany
	@JoinColumn(name="diagonal")
	private Diagonal diagonal;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToMany
	@JoinColumn(name="cpu")
	private Cpu cpu;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="ram")
	private Ram ram;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="hdd")
	private Hdd hdd;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="lastName")
	private User user;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="type")
	private Type type;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Laptop(String inventoryId, String model, String inputDoc, Brand brand, Diagonal diagonal, Cpu cpu, Ram ram,
			Hdd hdd, User user, Type type) {
		super();
		this.inventoryId = inventoryId;
		this.model = model;
		this.inputDoc = inputDoc;
		this.brand = brand;
		this.diagonal = diagonal;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.user = user;
		this.type = type;
	}

	public String getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
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

	public Diagonal getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(Diagonal diagonal) {
		this.diagonal = diagonal;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Hdd getHdd() {
		return hdd;
	}

	public void setHdd(Hdd hdd) {
		this.hdd = hdd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Laptop [inventoryId=" + inventoryId + ", model=" + model + ", inputDoc=" + inputDoc + ", brand=" + brand
				+ ", diagonal=" + diagonal + ", cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + ", user=" + user
				+ ", type=" + type + "]";
	}
	
}
