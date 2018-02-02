package org.iegs.trucks.services.volvo.model.md;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Customerable extends CrudRepository<Customer, Long>{
    List<Customer> findAll();
    Customer findCustomerById(long id);
    List<Customer> findCustomerByIdBetween(long low, long high);

}
