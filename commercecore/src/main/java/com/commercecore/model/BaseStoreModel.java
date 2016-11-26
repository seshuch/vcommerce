package com.commercecore.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="baseStore")
public class BaseStoreModel 
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String storeId;
	
	@Column
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<LanguageModel> supportedLanguages;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<CurrencyModel> supportedCurrencies;
	
	@OneToOne(fetch=FetchType.LAZY)
	private CurrencyModel defaultCurency;
	
	@OneToOne(fetch=FetchType.LAZY)
	private LanguageModel defaultLanguage;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<BaseSiteModel> baseSite;
}
