package com.commercefacades.facades.impl;

import java.util.ArrayList;
import java.util.List;

import com.commercecore.model.CustomerModel;
import com.commercecore.service.CustomerService;
import com.commercefacades.converters.Populator;
import com.commercefacades.data.CustomerData;
import com.commercefacades.facades.CustomerFacade;

public class DefaultCustomerFacade implements CustomerFacade 
{
	private CustomerService customerService;
	
	private Populator<CustomerModel, CustomerData> customerPopulator;
	
	public Populator<CustomerModel, CustomerData> getCustomerPopulator() {
		return customerPopulator;
	}


	public void setCustomerPopulator(Populator<CustomerModel, CustomerData> customerPopulator) {
		this.customerPopulator = customerPopulator;
	}


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


	public List<CustomerData> getCustomers() 
	{
		List<CustomerModel> customers=customerService.getModels();
		List<CustomerData> customerDataList= new ArrayList<CustomerData>();
		
		for(CustomerModel customer:customers)
		{
			CustomerData customerData= new CustomerData();
			customerData=customerPopulator.populate(customer, customerData);
			customerDataList.add(customerData);
		}
		return customerDataList;
	}

}
