package edu.iu.otiwari.c322finalbackend.repository;

import edu.iu.otiwari.c322finalbackend.model.Customer;
import edu.iu.otiwari.c322finalbackend.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlowersRepository
        extends CrudRepository<Flower, Integer> {

}
