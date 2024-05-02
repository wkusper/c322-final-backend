package edu.iu.wkusper.flowerorder.repository;

import edu.iu.wkusper.flowerorder.model.*;
import edu.iu.wkusper.flowerorder.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, String> {

}