package com.saffchen.planemanager;

import java.util.ArrayList;
import java.util.List;

public class PlaneManager {
    public static void main(String[] args) {

        Plane plane1 = new Passenger(Name.AIRBUS, Type.PASSENGER, 1995);
        Plane plane2 = new Military(Name.BOEING, Type.MILITARY, 2005);
        Plane plane4 = new Cargo(Name.AIRBUS, Type.CARGO, 1987);

        List<Plane> planes = new ArrayList<>();
        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane4);

        System.out.println(planes);

        plane1.addTimeOnService(23000);
        plane2.addTimeOnService(48000);
        plane4.addTimeOnService(12000);

        System.out.println(plane1.isReadyTimeToService);
        System.out.println(plane1.isReadyOnService());
        System.out.println(plane1);

        plane1.addTimeOnService(8000);

        System.out.println(plane1.isReadyTimeToService);
        System.out.println(plane1.isReadyOnService());
        System.out.println(plane1);
    }
}