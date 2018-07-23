package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5516740690415271310L;
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="office")
	private String office;

	@Column(name="password")
	private String password;

	public User() {
	}

	public User(int id) {
		super(id);
	}

	public User(String firstName, String lastName, String fatherName, String office, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.office = office;
		this.password = password;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRepository{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", fatherName='" + fatherName + '\'' +
				", office='" + office + '\'' +
				'}';
	}
}
