package com.commercecontent.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contentpage")
public class ContentPageModel 
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String code;
	
	@Column
	private String name;
	
	@Column
	private String pageName;
	
	@Column
	private String pageCode;
	
	@Column
	private String label;
	
	@Column
	private boolean isDefault;
	
	@OneToMany
	@JoinColumn(name="contentSoltID")
	private Set<ContentSlotModel> contentSlots;
	
	public Set<ContentSlotModel> getContentSlots() {
		return contentSlots;
	}
	public void setContentSlots(Set<ContentSlotModel> contentSlots) {
		this.contentSlots = contentSlots;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	
	
	public String getLabel()
	{
		return label;
	}
	public void setLabel(String label)
	{
		this.label = label;
	}
	public String getPageCode()
	{
		return pageCode;
	}
	public void setPageCode(String pageCode)
	{
		this.pageCode = pageCode;
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
	public String getPageName() {
		
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
}
