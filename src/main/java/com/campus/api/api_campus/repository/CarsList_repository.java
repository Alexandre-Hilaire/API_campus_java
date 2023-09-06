package com.campus.api.api_campus.repository;

import com.campus.api.api_campus.api.model.Cars;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsList_repository {
    private final List<Cars> carsList = new ArrayList<>();
    public List<Cars> CarsList_repository;

    public CarsList_repository (){
        carsList.add(new Cars(0, "Alpine", "Renault", "Blue"));
        carsList.add(new Cars(1, "Escort", "Ford", "White"));
        carsList.add(new Cars(2, "131 Abarth", "Fiat", "Black"));
    }
}
