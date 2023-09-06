package com.campus.api.api_campus.controller;

import com.campus.api.api_campus.api.model.Cars;
import com.campus.api.api_campus.repository.CarsList_repository;
import com.campus.api.api_campus.repository.Cars_repository;
import com.campus.api.api_campus.service.Cars_service;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cars")
public class Cars_controller {

    @Autowired
    private Cars_service cars_service;
    @Autowired
    private CarsList_repository carsList_repository;
//    @GetMapping("/cars")
//    public Iterable<Cars>getCars(){
//        return cars_service.getCars();
//    }
//    @PostMapping("/cars")
//    public Cars createCars(@RequestBody Cars cars){
//        return cars_service.save_cars(cars);
//    }
//    @GetMapping("/cars/{id}")
//    public Cars getCarsById(@PathVariable("id") final Long id) {
//        Optional<Cars> cars = cars_service.getCar(id);
//        return cars.orElse(null);
//    }
//    @PutMapping("/cars/{id}")
//    public Cars updateCars(@PathVariable("id") final Long id, @RequestBody Cars cars){
//        Optional<Cars> car = cars_service.getCar(id);
//        if(car.isPresent()){
//            Cars currentCar = car.get();
//            String Model = cars.getModel();
//            if (Model != null) {
//                currentCar.setModel(Model);
//            }
//            String Constructor = cars.getConstructor();
//            if (Constructor != null){
//                currentCar.setConstructor(Constructor);
//            }
//            String Color = cars.getColor();
//            if (Color != null){
//                currentCar.setColor(Color);
//            }
//            return currentCar;
//        }
//        else {
//            return null;
//        }
//    }
//    @DeleteMapping ("/cars/{id}")
//    public void deleteCar(@PathVariable("id") final Long id){
//        cars_service.delete_car(id);
//    }
    @GetMapping
    public List<Cars> getCars(){
        return carsList_repository.CarsList_repository;
    }
    @GetMapping("/{id}")
    public Cars getCarById(@PathVariable("id") Long id){
        Optional<Cars> car = cars_service.getCar(id);
        return car.orElse(null);
    }
    @PostMapping("/cars")
    public Cars createCar(@RequestBody Cars cars){
        return cars_service.save_cars(cars);
    }
    @PutMapping("/cars/{id}")
    public Cars updateCars(@PathVariable("id") Long id, @RequestBody Cars cars) {
        Optional<Cars> car = cars_service.getCar(id);
        if (car.isPresent()) {
            Cars currentCar = getCarById(id);
            String Model = cars.getModel();
            if (Model != null) {
                currentCar.setModel(Model);
            }
            return currentCar;
        }
        else {
            return null;
        }
    }
    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable("id") final Long id){
        cars_service.delete_car(id);
    }
}
