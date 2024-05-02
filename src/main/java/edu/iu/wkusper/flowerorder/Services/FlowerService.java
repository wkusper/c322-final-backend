package edu.iu.wkusper.flowerorder.Services;

import edu.iu.wkusper.flowerorder.model.Flower;
import edu.iu.wkusper.flowerorder.repository.FlowerRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FlowerService {

    FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository)  {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> findAll() throws IOException {
        return this.flowerRepository.findAll();

    }

    public Flower findById(String id) throws IOException {
        return this.flowerRepository.findById(id).get();

    }
    public void save(Flower id) throws Exception {
         this.flowerRepository.save(id);

    }
}
