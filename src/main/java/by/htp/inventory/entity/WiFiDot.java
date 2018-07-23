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
public class WiFiDot extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -342118176849668177L;
	@Column(name="inventoryId")
	private String inventoryId;
	
	@Column(name="model")
	private String model;
	
	@Column(name="inputDoc")
	private String inputDoc;
	
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="lastName")
	private User user;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="type")
	private Type type;

	public WiFiDot() {
	}

	public WiFiDot(int id) {
		super(id);
	}

	public WiFiDot(String inventoryId, String model, String inputDoc, User user, Type type) {
		super();
		this.inventoryId = inventoryId;
		this.model = model;
		this.inputDoc = inputDoc;
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
		return "WiFiDot [inventoryId=" + inventoryId + ", model=" + model + ", inputDoc=" + inputDoc + ", user=" + user
				+ ", type=" + type + "]";
	}
	
}
