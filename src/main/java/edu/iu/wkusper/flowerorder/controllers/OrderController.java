package edu.iu.wkusper.flowerorder.controllers;

import edu.iu.wkusper.flowerorder.Services.OrderDataService;
import edu.iu.wkusper.flowerorder.model.*;
import edu.iu.wkusper.flowerorder.model.OrderData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {
    private final OrderDataService orderDataService;

    public OrderController(OrderDataService orderDataService) {
        this.orderDataService = orderDataService;
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody OrderData order) {
        System.out.println(order.getUserid());
        try {
            orderDataService.makeOrder(order);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("gottem?");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

    @GetMapping("/{customerId}")
    public Object check(@PathVariable String customerId) {
        HashMap<String, ArrayList<OrderData>> result = new HashMap<>();

        try {
            result.put("orders", this.orderDataService.getUsersOrder(customerId));

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.orderDataService.getUsersOrder(customerId));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }

    }
}
