package com.example.springbootnodb.controller;

import com.example.springbootnodb.model.Toy;
import com.example.springbootnodb.service.ToyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/toy")
@RequiredArgsConstructor
public class ToyController {
    private final ToyService toyService;

    @GetMapping
    public List<Toy> getAllToys() {
        return toyService.getToys();
    }

    @GetMapping("/{name}")
    public Toy getToy(@PathVariable String name) {
        return toyService.getToy(name);
    }

    @PostMapping
    public Toy createToy(@RequestBody Toy toy) {
        return toyService.createToy(toy);
    }

    @PutMapping("/{name}")
    public Toy updateToy(@PathVariable String name, @RequestBody Toy toy) {
        return toyService.updateToy(name, toy);
    }

    @DeleteMapping("/{name}")
    public Toy deleteToy(@PathVariable String name) {
        return toyService.deleteToy(name);
    }
}
