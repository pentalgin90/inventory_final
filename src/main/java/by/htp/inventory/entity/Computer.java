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
public class Computer extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4826309309269019961L;
	@Column(name="inventoryId")
	private String inventoryId;
	
	@Column(name="model")
	private String model;
	
	@Column(name="inputDoc")
	private String inputDoc;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="cpu")
	private Cpu cpu;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="gpu")
	private Gpu gpu;
	
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
	@JoinColumn(name="ssd")
	private Ssd ssd;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="type")
	private Type type;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="user")
	private User user;

	public Computer() {
	}

	public Computer(int id) {
		super(id);
	}

	public Computer(String inventoryId, String model, String inputDoc, Cpu cpu, Gpu gpu, Ram ram, Hdd hdd, Ssd ssd,
			Type type, User user) {
		super();
		this.inventoryId = inventoryId;
		this.model = model;
		this.inputDoc = inputDoc;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
		this.hdd = hdd;
		this.ssd = ssd;
		this.type = type;
		this.user = user;
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

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Gpu getGpu() {
		return gpu;
	}

	public void setGpu(Gpu gpu) {
		this.gpu = gpu;
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

	public Ssd getSsd() {
		return ssd;
	}

	public void setSsd(Ssd ssd) {
		this.ssd = ssd;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Computer [inventoryId=" + inventoryId + ", model=" + model + ", inputDoc=" + inputDoc + ", cpu=" + cpu
				+ ", gpu=" + gpu + ", ram=" + ram + ", hdd=" + hdd + ", ssd=" + ssd + ", type=" + type + ", user="
				+ user + "]";
	}
	
}
