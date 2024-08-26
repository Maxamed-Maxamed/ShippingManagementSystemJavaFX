package com.example.shippingmanagementsystem.model;


import java.awt.*;

public class ContainerShip {
    private String name;
    private String identifier;
    private String flagState;
    private String photoURL;
    private LinkedList<Container> containers;
    private boolean isDocked;

    public ContainerShip(String name, String identifier, String flagState, String photoURL) {
        this.name = name;
        this.identifier = identifier;
        this.flagState = flagState;
        this.photoURL = photoURL;
        this.containers = new LinkedList<>();
        this.isDocked = false;
    }

    public void addContainer(Container container) {
        containers.add(container);
    }

    public void removeContainer(Container container) {
        containers.remove(container);
    }

    public void dock() {
        isDocked = true;
    }

    public void launch() {
        isDocked = false;
    }

    public boolean isDocked() {
        return isDocked;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getFlagState() {
        return flagState;
    }

    public void setFlagState(String flagState) {
        this.flagState = flagState;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public LinkedList<Container> getContainers() {
        return containers;
    }

    public void setContainers(LinkedList<Container> containers) {
        this.containers = containers;
    }

    public void setDocked(boolean docked) {
        isDocked = docked;
    }

    @Override
    public String toString() {
        return "ContainerShip{" +
                "name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", flagState='" + flagState + '\'' +
                ", photoURL='" + photoURL + '\'' +
                ", containers=" + containers +
                ", isDocked=" + isDocked +
                '}';
    }

}
