package com.campus.api.api_campus.api.model;
import java.util.ArrayList;
import java.util.List;

//package com.campus.api.api_campus.api.model;
//
import jakarta.persistence.*;
import lombok.Data;
//
@Data
@Entity
//@Table(name= "Cars")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Model;

    private String Constructor;

    private String color;

    public Cars(int id, String Model, String Constructor, String color){
        this.id = id;
        this.Model = Model;
        this.Constructor = Constructor;
        this.color = color;
    }
}
