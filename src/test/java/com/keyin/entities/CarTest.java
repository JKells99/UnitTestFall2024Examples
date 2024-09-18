package com.keyin.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    @Test
    @DisplayName("Test Create Car")
    public void testCreateCar(){

        List<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("Buick","Envista",2024);
        cars.add(car1);
        Assertions.assertEquals(1, cars.size());

    }



}
