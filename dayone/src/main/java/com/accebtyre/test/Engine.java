package com.accebtyre.test;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String engine;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
