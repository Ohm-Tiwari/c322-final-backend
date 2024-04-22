package edu.iu.otiwari.c322finalbackend.repository;

import edu.iu.otiwari.c322finalbackend.model.Customer;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Strings> {
    Customer findByUsername(String username);

}
