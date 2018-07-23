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
public class Printer extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2797888200247133756L;
	@Column(name="inventoryId")
	private String inventoryId;
	
	@Column(name="model")
	private String model;
	
	@Column(name="inputDoc")
	private String inputDoc;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="type")
	private Type type;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="typePrinter")
	private TypePrinter typePrinter;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="typeCartridge")
	private TypeCartridge typeCartridge;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="amountColor")
	private AmountColor amountColor;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="user")
	private User user;

	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Printer(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Printer(String inventoryId, String model, String inputDoc, Type type, TypePrinter typePrinter,
			TypeCartridge typeCartridge, AmountColor amountColor, User user) {
		super();
		this.inventoryId = inventoryId;
		this.model = model;
		this.inputDoc = inputDoc;
		this.type = type;
		this.typePrinter = typePrinter;
		this.typeCartridge = typeCartridge;
		this.amountColor = amountColor;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public TypePrinter getTypePrinter() {
		return typePrinter;
	}

	public void setTypePrinter(TypePrinter typePrinter) {
		this.typePrinter = typePrinter;
	}

	public TypeCartridge getTypeCartridge() {
		return typeCartridge;
	}

	public void setTypeCartridge(TypeCartridge typeCartridge) {
		this.typeCartridge = typeCartridge;
	}

	public AmountColor getAmountColor() {
		return amountColor;
	}

	public void setAmountColor(AmountColor amountColor) {
		this.amountColor = amountColor;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Printer [inventoryId=" + inventoryId + ", model=" + model + ", inputDoc=" + inputDoc + ", type=" + type
				+ ", typePrinter=" + typePrinter + ", typeCartridge=" + typeCartridge + ", amountColor=" + amountColor
				+ ", user=" + user + "]";
	}
	
}
