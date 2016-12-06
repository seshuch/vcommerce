package com.commercecontent.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContentSlotModel
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String position;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}	
}
