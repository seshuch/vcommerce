package com.commercecore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="language")
public class LanguageModel 
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String isoCode;
	
	@OneToOne(fetch= FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private BaseSiteModel baseSite;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private BaseStoreModel baseStore;
}
