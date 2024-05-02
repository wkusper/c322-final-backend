package edu.iu.wkusper.flowerorder.Services;

import edu.iu.wkusper.flowerorder.model.OrderData;
import edu.iu.wkusper.flowerorder.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class OrderDataService {
    OrderRepository orderRepository;
    FlowerService flowerService;

    public OrderDataService(OrderRepository orderRepository,
                            FlowerService flowerService) {
        this.orderRepository = orderRepository;
        this.flowerService = flowerService;
    }

    public ArrayList<OrderData> getUsersOrder(String user_id) throws IOException {

        return new ArrayList<>(this.orderRepository.findAllByUserid(user_id));

    }

    public void makeOrder(OrderData orderData) throws Exception {
            this.orderRepository.save(orderData);

    }
}
