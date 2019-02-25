package com.online.shopping.customerService;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.shopping.customerDao.CustomerJPARespository;
import com.online.shopping.dto.CustomerDto;
import com.online.shopping.model.CustomerBO;


@Service
public class CustomerOnlineServiceImpl implements CustomerOnlineService {
	
	public  CustomerOnlineServiceImpl() {
		modelMapper  = new ModelMapper();
	}

	@Override
	public List<CustomerDto> getCustomerDetails() {
		
		  List<CustomerDto> customerList = customerJPARespository.findAll().stream()
		  .map(customer -> modelMapper.map(customer,
		   CustomerDto.class)).collect(Collectors.toList()); 
		  return customerList;
	
	}
	
	@Override
	public CustomerDto getCustomerDetail(String fName) {		
		  	return modelMapper.map(customerJPARespository.findByFname(fName), CustomerDto.class);
				//return null;			
	}
	
	@Override
	public void updateCustomerDetail(String fName) {
		//modelMapper.map(customerJPARespository., destinationType)
		CustomerBO customerBO = new CustomerBO();
		CustomerDto customerDto = modelMapper.map(customerJPARespository.findByFname(fName), CustomerDto.class);
		customerDto.setEmail("pqxy@gmail.com");
		modelMapper.map(customerDto, customerBO);
		customerJPARespository.save(customerBO);
	}

	@Override
	public void addCustomerDetail() {
		CustomerBO customerBO = new CustomerBO();
		CustomerDto customerDto = new CustomerDto("25", "m.gmail.com", "Man", "Gup");
		modelMapper.map(customerDto, customerBO);
		customerJPARespository.save(customerBO);
		
	}
	
	@Override
	public void removeCustomer(String fname) {		
		customerJPARespository.delete(customerJPARespository.findByFname(fname));		
	}
	
	private ModelMapper modelMapper;
	@Autowired
	private CustomerJPARespository customerJPARespository;
	//private CustomerShoppingDao customerShoppingDao;
	
	
	
	
}
