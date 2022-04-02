package com.saffchen.planemanager;

public class Cargo extends Plane {

    @Override
    public int getIsReadyTimeToService() {
        return super.getIsReadyTimeToService();
    }

    @Override
    public boolean isReadyOnService() {
        if (isReadyTimeToService > 20000) {
            isReadyTimeToService = 0;
            return true;
        }
        return false;
    }

    public Cargo(Name name, Type type, int yearOfProduction) {
        super(name, type, yearOfProduction);
    }
}
