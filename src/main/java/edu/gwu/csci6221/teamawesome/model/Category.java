package edu.gwu.csci6221.teamawesome.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {
	private static final long serialVersionUID = 6523680602998455278L; //idk what this does...

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "Category")
	String category;

	public Category(long id, String category) {
		super();
		this.id = id;
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}