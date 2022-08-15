package com.example.jerseyreproducer;

public class SimpleEntity implements Entity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return "simple entity";
    }
}
