package com.example.demo.cars;

import org.springframework.data.domain.Sort;

import java.util.List;

public  class CarRepository implements CarRepositoryInterface{

    @Override
    public List<Car> findByEngineerName(String engineerName) {
        return null;
    }
}
