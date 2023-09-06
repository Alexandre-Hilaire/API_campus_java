package com.campus.api.api_campus.service;
import com.campus.api.api_campus.api.model.Cars;
import com.campus.api.api_campus.repository.CarsList_repository;
import com.campus.api.api_campus.repository.Cars_repository;
import com.sun.jdi.IntegerValue;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
@Service
public class Cars_service {
    private final boolean useBDD = false;

    @Autowired
    private Cars_repository carsRepository;

    @Autowired
    private CarsList_repository carsList_repository;
    public Optional<Cars> getCar(final Long id) {
        if (useBDD) {
            return carsRepository.findById(id);
        }
        else {
            return carsList_repository.getCarById(id);
        }
    }
    public Iterable<Cars> getCars(){
        if (useBDD) {
            return carsRepository.findAll();
        }
        else {
            return carsList_repository.getCarsList();
        }
    }
    public void delete_car(final Long id){
        if (useBDD) {
            carsRepository.deleteById(id);
        }
        else {
            carsList_repository.deleteCarById(id);
        }
    }
    public Cars save_cars(Cars cars){
        if (useBDD) {
            return carsRepository.save(cars);
        }
        else {
            carsList_repository.addCar(cars);
            return cars;
        }
    }
}
