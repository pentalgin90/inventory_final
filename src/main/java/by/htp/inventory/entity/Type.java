package by.htp.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="type")
public class Type extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2795830910550002778L;
	@Column(name="title")
	private String title;
	public Type() {
	}
	public Type(int id) {
		super(id);
	}
	public Type(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Type [title=" + title + "]";
	}
	
}
