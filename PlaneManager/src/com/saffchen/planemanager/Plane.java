package com.saffchen.planemanager;

import java.util.Objects;

public abstract class Plane implements Service {
    Name name;
    Type type;
    int yearOfProduction;
    private double timeOnService = 0;
    protected int isReadyTimeToService = 0;

    public Plane(Name name, Type type, int yearOfProduction) {
        this.name = name;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
    }

    public void addTimeOnService(int additionalTime) {
        if (additionalTime > 0) {
            timeOnService += additionalTime;
            isReadyTimeToService += additionalTime;
        } else System.out.println("Вы не можете уменьшить количество часов налета!");
    }

    public int getIsReadyTimeToService() {
        return isReadyTimeToService;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name=" + name +
                ", type=" + type +
                ", yearOfProduction=" + yearOfProduction +
                ", timeOnService=" + timeOnService +
                ", isReadyTimeToService=" + isReadyTimeToService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (yearOfProduction != plane.yearOfProduction) return false;
        if (!Objects.equals(name, plane.name)) return false;
        return Objects.equals(type, plane.type);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + yearOfProduction;
        return result;
    }
}