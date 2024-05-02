package edu.iu.wkusper.flowerorder.repository;

import edu.iu.wkusper.flowerorder.model.*;
import edu.iu.wkusper.flowerorder.model.OrderData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderData, Long> {

    List<OrderData> findAllByUserid(String user_id);

}