package edu.gwu.csci6221.teamawesome.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEWLOG")
public class ViewLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4132784734017546104L;

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "task_id")
	int taskId;
	
	@Column(name = "viewed_by_id")
	int viewedById;
	
	@Column(name = "date_viewed")
	Date dateViewed;

	public ViewLog() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getViewedById() {
		return viewedById;
	}

	public void setViewedById(int viewedById) {
		this.viewedById = viewedById;
	}

	public Date getDateViewed() {
		return dateViewed;
	}

	public void setDateViewed(Date dateViewed) {
		this.dateViewed = dateViewed;
	}
}