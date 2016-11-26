package com.commercecontent.model;

import java.util.Set;

public class ContentSlotModel
{
	private int id;
	private String position;
	private Set<AbstractComponentModel> components;
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
	public Set<AbstractComponentModel> getComponents()
	{
		return components;
	}
	public void setComponents(Set<AbstractComponentModel> components)
	{
		this.components = components;
	}
	
}
