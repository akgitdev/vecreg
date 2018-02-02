package org.iegs.trucks.services.volvo.controller;

import org.iegs.trucks.services.volvo.model.md.Customer;
import org.iegs.trucks.services.volvo.model.md.Customerable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbEngine {

    @Autowired
    private Customerable customerable;

    public void saveCustomer(Customer customer) {
        customerable.save(customer);
    }

    public Customer readCustomerById(long id) {
        return customerable.findCustomerById(id);
    }

    public List<Customer> readAllCustomers() {
        return customerable.findAll();
    }

    public List<Customer> readCustomersBetweenId(long low, long high) {
        return customerable.findCustomerByIdBetween(low, high);
    }

}
