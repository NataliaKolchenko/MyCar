package com.example.demo.cars;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepositoryInterface extends JpaRepository<Car, Long> {
    List<Car> findByEngineerId(Long engineerId);
}
