package com.campus.api.api_campus.service;
import com.campus.api.api_campus.api.model.Cars;
import com.campus.api.api_campus.repository.Cars_repository;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
@Data
@Service
public class Cars_service {

    @Autowired
    private Cars_repository carsRepository;
    public Optional<Cars> getCar(final Long id) {
        return carsRepository.findById(id);
    }
    public Iterable<Cars> getCars(){
        return carsRepository.findAll();
    }
    public void delete_car(final Long id){
        carsRepository.deleteById(id);
    }
    public Cars save_cars(Cars cars){
        Cars saved_cars = carsRepository.save(cars);
        return saved_cars;
    }
}
