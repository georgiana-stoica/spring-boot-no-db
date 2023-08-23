package com.example.springbootnodb.controller;

import com.example.springbootnodb.model.Car;
import com.example.springbootnodb.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/cars")
public class CarController {
    private final CarService carService;

    @GetMapping
    public List<Car> getCars() {
        return carService.getCarList();
    }

    @PostMapping
    public void createCar(@RequestBody Car car) {
        carService.saveCar(car);
    }

    @PutMapping
    public void updateCar(@RequestBody Car car) {
        carService.updateCar(car);
    }

    @PostMapping("buy")
    public void buyCar(@RequestParam("carId") Long carId, @RequestParam("quantity") Long quantity) {
        carService.buyCar(carId, quantity);
    }
}
