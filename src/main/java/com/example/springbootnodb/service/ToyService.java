package com.example.springbootnodb.service;

import com.example.springbootnodb.model.Toy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToyService {
    private final MockDBService mockDBService;

    public List<Toy> getToys() {
        return mockDBService.getToys();
    }

    public Toy getToy(String name) {
        return mockDBService.getToy(name);
    }

    public Toy createToy(Toy toy) {
        return mockDBService.createToy(toy);
    }

    public Toy updateToy(String name, Toy toy) {
        return mockDBService.updateToy(name, toy);
    }

    public Toy deleteToy(String name) {
        return mockDBService.deleteToy(name);
    }
}
