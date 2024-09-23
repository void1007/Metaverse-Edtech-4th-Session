package dw.wholesale_company.Controller;


import dw.wholesale_company.Model.Customer;
import dw.wholesale_company.Service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CustomerController {
    CustomerService  customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomer(){return customerService.getAllCustomer();}
}
