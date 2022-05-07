package com.tejaswini.restfuldocker.repository;

import com.tejaswini.restfuldocker.modals.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findByDriver(Long driver);
}
