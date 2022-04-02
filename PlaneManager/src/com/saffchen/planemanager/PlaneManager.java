package com.saffchen.planemanager;

import java.util.ArrayList;
import java.util.List;
import static java.lang.String.valueOf;

public class PlaneManager {
    public static void main(String[] args) {

        Plane plane1 = new Passenger(Name.AIRBUS, Type.PASSENGER, 1995);
        Plane plane2 = new Military(Name.BOEING, Type.MILITARY, 2005);
        Plane plane3 = new Cargo(Name.AIRBUS, Type.CARGO, 1987);

        List<Plane> planes = new ArrayList<>();
        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane3);

        print(valueOf(planes));

        plane1.addTimeOnService(23000);
        plane2.addTimeOnService(48000);
        plane3.addTimeOnService(12000);

        print(("Количество часов налета plane1: " + plane1.isReadyTimeToService));
        print(("Количество часов налета plane2: " + plane2.isReadyTimeToService));
        print(("Количество часов налета plane3: " + plane3.isReadyTimeToService));

        plane1.addTimeOnService(8000);

        print("Готов ли самолет к обслуживанию? " + plane1.isReadyOnService());
        print(valueOf(plane1));
    }

    private static void print(String text){
        System.out.println(text);
    }
}