package uwu.restfulservicespring5.demo.services;

import uwu.restfulservicespring5.demo.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findById(Long id);
    List<Customer> findAll();
    Customer saveCustomer(Customer customer);
    void deleteCustomerById(Long id);
}
