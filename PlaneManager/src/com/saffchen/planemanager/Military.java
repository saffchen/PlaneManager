package com.saffchen.planemanager;

public class Military extends Plane {

    @Override
    public int getIsReadyTimeToService() {
        return super.getIsReadyTimeToService();
    }

    @Override
    public boolean isReadyOnService() {
        if (isReadyTimeToService > 50000) {
            isReadyTimeToService = isReadyTimeToService - 50000;
            return true;
        }
        return false;
    }

    public Military(Name name, Type type, int yearOfProduction) {
        super(name, type, yearOfProduction);
    }
}
