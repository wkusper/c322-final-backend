package edu.iu.wkusper.flowerorder.controllers;

import edu.iu.wkusper.flowerorder.Services.FlowerService;
import edu.iu.wkusper.flowerorder.model.Flower;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@CrossOrigin
@RequestMapping("/flowers")
@RestController
public class FlowerController {

    FlowerService flowerService;

    public FlowerController(FlowerService flowerService) throws Exception {


        this.flowerService = flowerService;
        this.flowerService.save(new Flower("Sugar Rush","MIXED","BIRTHDAY","MIXED","54"));
        this.flowerService.save(new Flower("Lemonade","ROSES","THANKS","YELLOW","54"));
        this.flowerService.save(new Flower("The Angels","ROSES","MOTHERS_DAY","RED","54"));
        this.flowerService.save(new Flower("Casablanca","MIXED","BIRTHDAY","GREEN","59"));
        this.flowerService.save(new Flower("Sierra Sunset","TULIPS","THANKS","RED","59"));
        this.flowerService.save(new Flower("Unbreakable","LILIES","MOTHERS_DAY","GREEN","59"));
    }

    @GetMapping
    public ResponseEntity<?> getFlowers() {
        try {
            ArrayList<Flower> result = new ArrayList<>(this.flowerService.findAll());
            Collections.sort(result);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(result);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getSpecificFlower(@PathVariable String id) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.flowerService.findById(id));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }


    @GetMapping("/image/{id}")
    public ResponseEntity<Resource> getImage(@PathVariable String id) throws IOException {
        Resource to_send = new FileUrlResource("./flowers/" + id + ".png");
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.IMAGE_PNG)
                .body(to_send);
    }
}
