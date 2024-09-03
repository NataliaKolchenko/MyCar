package com.example.demo.cars;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class CarService {
    private final CarRepositoryInterface carRepository;

    public List<Car> getAllCars(){
        List<Car> carList = carRepository.findAll();
        return carList;
    }

    public Optional<Car> getCarById(Long carId){
        Optional<Car> car = carRepository.findById(carId);
        return car;
    }

    public Car addCar(Car car){
        Car newCar = carRepository.save(car);
        return newCar;
    }

    public List<Car> findByEngineerId(Long engineerId){
        List<Car> carList = carRepository.findByEngineerId(engineerId);
        return carList;
    }


}
