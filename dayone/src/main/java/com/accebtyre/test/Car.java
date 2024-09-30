package com.accebtyre.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Car {
    private String carType;

    private Engine engine;
    @Autowired
    Car(Engine eng) {
        this.engine = eng;
    }

    public void modifyCar(String carName) {
        this.carType = carName;
        engine.setEngine("Turbo engine");
    }
}
