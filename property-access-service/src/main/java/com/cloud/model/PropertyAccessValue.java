package com.cloud.model;

public class PropertyAccessValue {

    private String name;
    private String description;


    public PropertyAccessValue(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PropertyAccessValue{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

