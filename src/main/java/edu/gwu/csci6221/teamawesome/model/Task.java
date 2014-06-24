package edu.gwu.csci6221.teamawesome.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TASK")
public class Task implements Serializable {
	private static final long serialVersionUID = 6523680602998455278L; //idk what this does...

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "date_created")
	Date dateCreated;
	
	@Column(name = "date_claimed")
	Date dateClaimed;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "category")
	Category categoryID;
	
	@Column(name = "payment")
	float payment;
	
	@Column(name = "posted_by")
	User postedBy;
	
	@Column(name = "claimed_by")
	User claimedBy;
	
	@Column(name = "deadline")
	Date deadline;
	
	@Column(name = "task_zip")
	long taskZip;

	public Task(long id, Date dateCreated, Date dateClaimed,
			String description, Category categoryID, float payment,
			User postedBy, User claimedBy, Date deadline) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.dateClaimed = dateClaimed;
		this.description = description;
		this.categoryID = categoryID;
		this.payment = payment;
		this.postedBy = postedBy;
		this.claimedBy = claimedBy;
		this.deadline = deadline;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateClaimed() {
		return dateClaimed;
	}

	public void setDateClaimed(Date dateClaimed) {
		this.dateClaimed = dateClaimed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Category categoryID) {
		this.categoryID = categoryID;
	}

	public float getPayment() {
		return payment;
	}

	public void setPayment(float payment) {
		this.payment = payment;
	}

	public User getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}

	public User getClaimedBy() {
		return claimedBy;
	}

	public void setClaimedBy(User claimedBy) {
		this.claimedBy = claimedBy;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public long getTaskZip() {
		return taskZip;
	}

	public void setTaskZip(long taskZip) {
		this.taskZip = taskZip;
	}
	
}