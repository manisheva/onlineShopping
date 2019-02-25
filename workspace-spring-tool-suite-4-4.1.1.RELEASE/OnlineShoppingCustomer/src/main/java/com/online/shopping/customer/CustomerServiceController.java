package com.online.shopping.customer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.shopping.customerService.CustomerOnlineService;
import com.online.shopping.dto.CustomerDto; 

@RestController
public class CustomerServiceController {	
	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
	
	/**
	 * get the all customer information.
	 * @return
	 */
	@RequestMapping(value = "/service1/customers", method = RequestMethod.GET)
	public ResponseEntity getCustomers(){
		//return null;
		//System.out.println("Hiiii--"+customerOnlineService);
		List<CustomerDto> cutomers = customerOnlineService.getCustomerDetails();
		//System.out.println("Hey::"+cutomers);
		return new ResponseEntity(cutomers, HttpStatus.OK);
	}
	
	/**
	 * Fetch the customer information
	 * @param fname
	 * @return
	 */
	 @RequestMapping(value = "/service1/customer/{fname}", method = RequestMethod.GET) 
	 public CustomerDto getCustomer(@PathVariable String fname) {
		 return customerOnlineService.getCustomerDetail(fname); 
	  }
	 
	/**
	 * Update the info of Customer 
	 * @param fname
	 */
	@RequestMapping(value = "/service1/customerUpdate/{fname}")
	public void updateCustomer(@PathVariable String fname) {
		customerOnlineService.updateCustomerDetail(fname);
	}
	 
	 
	 /**
	  * Add New Customer Information
	  * @return
	  */
	 @RequestMapping(value = "/service1/addCustomer")
	 public String addCustomer() {		 
		  customerOnlineService.addCustomerDetail(); 
		  return "Custoerm Added...";
	  }
	 
	
	 @RequestMapping(value = "/service1/deleteCustomer/{fname}")
	 public String removeCustomer(@PathVariable String fname) {		 
		  customerOnlineService.removeCustomer(fname); 
		  return "Custoerm Deleted...";
	  }
	 @Autowired
	 private CustomerOnlineService customerOnlineService;
	
	
}
