package com.example.springbootnodb.service;

import com.example.springbootnodb.model.Car;
import com.example.springbootnodb.model.Order;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class CarService {
    private final OrderService orderService;
    private final List<Car> carList = new ArrayList<>();

    public void saveCar(Car car) {
        car.setId((long) carList.size());
        carList.add(car);
    }

    public void updateCar(Car car) {
        Car selectedCar = null;
        for (Car carItr : carList) {
            if (carItr.getId().equals(car.getId())) {
                selectedCar = carItr;
                break;
            }
        }

        if (selectedCar == null) return;

        if (car.getStock() != null) {
            selectedCar.setStock(car.getStock());
        }
        if (car.getPrice() != null) {
            selectedCar.setPrice(car.getPrice());
        }
    }

    public void buyCar(Long carToBuyId, Long quantity) {
        Car selectedCar = null;
        for (Car carItr : carList) {
            if (carItr.getId().equals(carToBuyId)) {
                selectedCar = carItr;
                break;
            }
        }

        if (selectedCar == null || selectedCar.getStock() < quantity) return;

        selectedCar.setStock(selectedCar.getStock() - quantity);

        orderService.saveOrder(new Order((long) orderService.getOrderList().size(), carToBuyId, quantity, quantity * selectedCar.getPrice()));
    }
}
