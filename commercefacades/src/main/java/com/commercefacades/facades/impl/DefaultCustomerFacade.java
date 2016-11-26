package com.commercefacades.facades.impl;

import java.util.ArrayList;
import java.util.List;

import com.commercecore.model.CustomerModel;
import com.commercecore.service.CustomerService;
import com.commercefacades.data.CustomerData;
import com.commercefacades.facades.CustomerFacade;

public class DefaultCustomerFacade implements CustomerFacade 
{
	private CustomerService customerService;
	
	public CustomerService getCustomerService() {
		return customerService;
	}


	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	public void saveCustomer(CustomerData customerData) 
	{
		CustomerModel customerModel= new CustomerModel();
		customerModel.setFirstName(customerData.getFirstName());
		customerModel.setLastName(customerData.getLastName());
		customerService.saveModel(customerModel);
	}


	public List<CustomerModel> getCustomers() 
	{
		List<CustomerModel> customers=customerService.getModels();
		List<CustomerData> customerDataList= new ArrayList<CustomerData>();
		customerService.getModels();
		return customerService.getModels();
	}

}
