package com.commercecontent.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pageTemplate")
public class PageTemplateModel
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String code;
	
	@Column
	private String name;
	
	@Column
	private String frontPageName;
	
	@Column
	@OneToOne(fetch=FetchType.LAZY)
	private ContentPageModel defaultPage;
	
	private Set<TemplateSlotModel> availableSlots;
	
	public Set<TemplateSlotModel> getAvailableSlots()
	{
		return availableSlots;
	}
	public void setAvailableSlots(Set<TemplateSlotModel> availableSlots)
	{
		this.availableSlots = availableSlots;
	}
	public ContentPageModel getDefaultPage()
	{
		return defaultPage;
	}
	public void setDefaultPage(ContentPageModel defaultPage)
	{
		this.defaultPage = defaultPage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrontPageName() {
		return frontPageName;
	}
	public void setFrontPageName(String frontPageName) {
		this.frontPageName = frontPageName;
	}
	
}
