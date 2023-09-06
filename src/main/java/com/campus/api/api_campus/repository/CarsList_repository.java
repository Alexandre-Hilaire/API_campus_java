package com.campus.api.api_campus.repository;

import com.campus.api.api_campus.api.model.Cars;
import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Repository
public class CarsList_repository {

    private final List<Cars> carsList = new ArrayList<>();

    public CarsList_repository (){
        carsList.add(new Cars(0, "Alpine", "Renault", "Blue"));
        carsList.add(new Cars(1, "Escort", "Ford", "White"));
        carsList.add(new Cars(2, "131 Abarth", "Fiat", "Black"));
    }
    public Optional<Cars> getCarById(Long id) {
        for (Cars cars : carsList) {
            if (cars.getId() == id) {
                return Optional.of(cars);
            }
        }
        return null;
    }
    public void deleteCarById(Long id){
        int Id = id.intValue();
        carsList.removeIf(car -> car.getId() == Id);
        }
    public void addCar(Cars car){
        carsList.add(car);
    }
}
