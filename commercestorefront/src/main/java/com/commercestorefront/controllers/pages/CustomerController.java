package com.commercestorefront.controllers.pages;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.commercefacades.data.CustomerData;
import com.commercefacades.facades.CustomerFacade;
import com.commercestorefront.forms.CustomerForm;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Resource(name="customerFacade")
	private CustomerFacade customerFacade;
	
	
	public CustomerFacade getCustomerFacade() {
		return customerFacade;
	}

	public void setCustomerFacade(CustomerFacade customerFacade) {
		this.customerFacade = customerFacade;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String registerCustomer(Model model)
	{
		return "forms/addCustomer";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveCustomer(Model model, CustomerForm customerForm)
	{
		CustomerData customerData= new CustomerData();
		customerData.setFirstName(customerForm.getFirstName());
		customerData.setLastName(customerForm.getLastName());
		getCustomerFacade().saveCustomer(customerData);
		return "forms/addCustomer";
	}
}
