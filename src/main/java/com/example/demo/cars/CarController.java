package com.example.demo.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;


    @PostMapping("/addCar")
    public Car addCar(@RequestBody @Validated Car car) {
        Car newCar = carService.addCar(car);
        return newCar;
    }

    @GetMapping(value = "/allCars")
    public List<Car> getAllCars() {
        List<Car> carList = carService.getAllCars();
        return carList;
    }

    @GetMapping("/allCars/{carId}")
    public Optional<Car> getCarById(@PathVariable Long carId) {
        Optional<Car> car = carService.getCarById(carId);
        return car;
    }


    @GetMapping("/getCarsByEngineerId")
    public List<Car> getCarsByEngineerId(@RequestParam Long engineerId) {
        List<Car> carList = carService.findByEngineerId(engineerId);
        return carList;
    }


}
