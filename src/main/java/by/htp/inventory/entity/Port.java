package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="port")
public class Port extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8803905029175204894L;
	@Column(name="port")
	private String port;
	public Port() {
	}
	public Port(int id) {
		super(id);
	}
	public Port(String port) {
		super();
		this.port = port;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "Port [port=" + port + "]";
	}
	
}
