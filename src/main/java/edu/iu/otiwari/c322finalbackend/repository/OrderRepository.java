package edu.iu.otiwari.c322finalbackend.repository;

import edu.iu.otiwari.c322finalbackend.model.OrderData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository
        extends CrudRepository<OrderData, Integer>
        , QueryByExampleExecutor<OrderData> {
    List<OrderData> findAllByCustomerUserName(String customerUserName);
}
