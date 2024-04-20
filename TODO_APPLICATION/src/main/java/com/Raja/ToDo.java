package com.Raja;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todo")
public class ToDo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String title;
	private String task_1;
	private String task_2;
	private String task_3;
	private String Note;
	private String status;
	
	@Column
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date date;
	
	public ToDo(Long id, String title, Date date,String task_1,String task_2,String task_3, String status,String Note) 
	{
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.status = status;
		this.task_1= task_1;
		this.task_1= task_2;
		this.task_1= task_3;
		this.Note=Note;
	}

	public ToDo() 
	{
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getTask_1() {
		return task_1;
	}

	public void setTask_1(String task_1) {
		this.task_1 = task_1;
	}

	public String getTask_2() {
		return task_2;
	}

	public void setTask_2(String task_2) {
		this.task_2 = task_2;
	}

	public String getTask_3() {
		return task_3;
	}

	public void setTask_3(String task_3) {
		this.task_3 = task_3;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}
	
	
	
	
	
	

}
