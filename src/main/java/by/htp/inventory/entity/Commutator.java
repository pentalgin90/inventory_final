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
public class Commutator extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 575626756700444344L;
	@Column(name="inventoryId")
	private String inventoryId;
	
	@Column(name="model")
	private String model;
	
	@Column(name="inputDoc")
	private String inputDoc;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="port")
	private Port port;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="user")
	private User user;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="type")
	private Type type;

	public Commutator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commutator(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Commutator(String inventoryId, String model, String inputDoc, Port port, User user, Type type) {
		super();
		this.inventoryId = inventoryId;
		this.model = model;
		this.inputDoc = inputDoc;
		this.port = port;
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

	public Port getPort() {
		return port;
	}

	public void setPort(Port port) {
		this.port = port;
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
		return "Commutator [inventoryId=" + inventoryId + ", model=" + model + ", inputDoc=" + inputDoc + ", port="
				+ port + ", user=" + user + ", type=" + type + "]";
	}

	
	
}
