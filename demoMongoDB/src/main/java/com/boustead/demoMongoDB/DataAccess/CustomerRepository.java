package com.boustead.demoMongoDB.DataAccess;

import java.util.List;

import com.boustead.demoMongoDB.DBObjects.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}