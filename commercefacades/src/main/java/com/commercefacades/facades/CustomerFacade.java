package com.commercefacades.facades;

import java.util.List;

import com.commercecore.model.CustomerModel;
import com.commercefacades.data.CustomerData;

public interface CustomerFacade 
{
	void saveCustomer(CustomerData customerData);
	List<CustomerModel> getCustomers();
}
