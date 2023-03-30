package com.crud.spring.garageapp.services;


import com.crud.spring.garageapp.models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    static private ArrayList<Car> cars=new ArrayList<>(Arrays.asList(
            new Car(1,"Laguna","Renault",2004,Car.Color.RED),
            new Car(2,"Kongo","Dacia",2008,Car.Color.BLUE),
            new Car(3,"RTX","Ferarri",2020,Car.Color.YELLOW),
            new Car(4,"Clio","Renault",2017,Car.Color.GREEN)
    ));
    public List<Car> getCars(){
        return cars;
    }

    public Car getCar(long id) {
        return cars.stream().filter(car -> car.getId()==id).findFirst().orElse(null);
    }
}
