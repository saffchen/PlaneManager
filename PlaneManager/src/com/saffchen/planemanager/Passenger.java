package com.saffchen.planemanager;

public class Passenger extends Plane {

    @Override
    public int getIsReadyTimeToService() {
        return super.getIsReadyTimeToService();
    }

    @Override
    public boolean isReadyOnService() {
        if (isReadyTimeToService > 30000) {
            isReadyTimeToService = 0;
            return true;
        }
        return false;
    }

    public Passenger(Name name, Type type, int yearOfProduction) {
        super(name, type, yearOfProduction);
    }
}
