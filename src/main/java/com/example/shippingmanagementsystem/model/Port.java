package com.example.shippingmanagementsystem.model;


import java.awt.*;

public class Port {
    private String name;
    private String code;
    private String country;
    private LinkedList<Container> containers;

    public Port(String name, String code, String country) {
        this.name = name;
        this.code = code;
        this.country = country;
        this.containers = new LinkedList<>();
    }

    public void addContainer(Container container) {
        containers.add(container);
    }

    public void removeContainer(Container container) {
        containers.remove(container);
    }

    public LinkedList<Container> getContainers() {
        return containers;
    }

    // Getters and Setters for name, code, and country


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setContainers(LinkedList<Container> containers) {
        this.containers = containers;
    }



    @Override
    public String toString() {
        return "Port{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", country='" + country + '\'' +
                ", containers=" + containers +
                '}';
    }

}

