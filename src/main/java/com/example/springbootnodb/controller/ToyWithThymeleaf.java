package com.example.springbootnodb.controller;

import com.example.springbootnodb.service.ToyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/toy")
public class ToyWithThymeleaf {
    private final ToyService toyService;

    @RequestMapping("/index")
    public String getAllToys(Model model) {
        model.addAttribute("toys", toyService.getToys());
        return "index";
    }

    @RequestMapping("/{name}")
    public String getToy(@PathVariable String name, Model model) {
        model.addAttribute("toy", toyService.getToy(name));
        return "toy";
    }
}
