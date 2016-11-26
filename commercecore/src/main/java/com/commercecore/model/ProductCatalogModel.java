package com.commercecore.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productCatalog")
public class ProductCatalogModel 
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String code;
	
	@Column
	private String name;
	
	@Column
	private String version;
	
	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<CategoryModel> categories;*/
}
