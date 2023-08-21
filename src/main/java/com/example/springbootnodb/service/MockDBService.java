package com.example.springbootnodb.service;

import com.example.springbootnodb.model.Toy;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class MockDBService {
    public List<Toy> toys = new ArrayList<>();

    public Toy getToy(String name) {
        for (Toy toy : toys) {
            if (toy.getName().equals(name)) {
                return toy;
            }
        }
        return null;
    }

    public Toy createToy(Toy toy) {
        toys.add(toy);
        return toy;
    }

    public Toy updateToy(String name, Toy toy) {
        for (Toy t : toys) {
            if (t.getName().equals(name)) {
                t.setName(toy.getName());
                t.setColor(toy.getColor());
                t.setType(toy.getType());
                t.setDescription(toy.getDescription());
                t.setImageURL(toy.getImageURL());
                return t;
            }
        }
        return null;
    }

    public Toy deleteToy(String name) {
        for (Toy toy : toys) {
            if (toy.getName().equals(name)) {
                toys.remove(toy);
                return toy;
            }
        }
        return null;
    }
}
