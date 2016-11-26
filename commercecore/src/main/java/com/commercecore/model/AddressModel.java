package com.commercecore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class AddressModel 
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String firstName;
	
	@Column
	private String LastName;
	
	@Column
	private String houseNumber;
	
	@Column
	private String street;
	
	@Column
	private String landMark;
	
	@Column
	private String state;
	
	@OneToOne(fetch=FetchType.LAZY)
	private CountryModel country;
	
	@Column
	private String zipCode;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	@Column
	private boolean isBillingAddress;
	
	@Column
	private boolean isShippingAddress;
	
	@Column
	private boolean isDefaultAddress;
}
