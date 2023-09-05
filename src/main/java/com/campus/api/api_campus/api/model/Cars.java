package com.campus.api.api_campus.api.model;
import java.util.ArrayList;
import java.util.List;

//package com.campus.api.api_campus.api.model;
//
import jakarta.persistence.*;
//
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

    public int getId() {
        return id;
    }

    public String getModel() {
        return Model;
    }

    public String getConstructor() {
        return Constructor;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setConstructor(String constructor) {
        Constructor = constructor;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
