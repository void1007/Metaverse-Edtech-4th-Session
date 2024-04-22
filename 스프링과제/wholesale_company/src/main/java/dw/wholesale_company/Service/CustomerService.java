package dw.wholesale_company.Service;

import dw.wholesale_company.Model.Customer;
import dw.wholesale_company.Repository.CustomerRepository;

import java.util.List;

public class CustomerService {
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomer(){return customerRepository.findAll();}
}
