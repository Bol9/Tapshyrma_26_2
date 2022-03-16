package com.company;

import java.util.Objects;

public class City {
    private int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public City() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return code == city.code && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    public int getCode() {
        return code;
    }

    public int setCode(int code) {
        //this.code = code;
        return code;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return name;
    }
}
