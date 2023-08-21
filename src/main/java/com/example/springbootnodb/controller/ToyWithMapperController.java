package com.example.springbootnodb.controller;

import com.example.springbootnodb.dto.ToyDTO;
import com.example.springbootnodb.mapper.ToyMapper;
import com.example.springbootnodb.service.ToyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/toy/with-mapper")
@RequiredArgsConstructor
public class ToyWithMapperController {
    private final ToyService toyService;
    private final ToyMapper toyMapper;

    @GetMapping
    public List<ToyDTO> getAllToys() {
        return toyService.getToys().stream().map(toyMapper::toToyDTO).toList();
    }

    @GetMapping("/{name}")
    public ToyDTO getToy(@PathVariable String name) {
        return toyMapper.toToyDTO(toyService.getToy(name));
    }
}
