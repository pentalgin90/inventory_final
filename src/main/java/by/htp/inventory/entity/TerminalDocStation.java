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
public class TerminalDocStation extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2679895874170850505L;
	@Column(name="inventoryId")
	private String inventaryId;
	
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

	public TerminalDocStation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TerminalDocStation(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public TerminalDocStation(String inventaryId, String model, String inputDoc, User user, Type type) {
		super();
		this.inventaryId = inventaryId;
		this.model = model;
		this.inputDoc = inputDoc;
		this.user = user;
		this.type = type;
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
		return "TerminalDocStation [inventaryId=" + inventaryId + ", model=" + model + ", inputDoc=" + inputDoc
				+ ", user=" + user + ", type=" + type + "]";
	}
	
	
}
