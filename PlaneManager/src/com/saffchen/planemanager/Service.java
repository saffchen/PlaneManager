package com.saffchen.planemanager;

public interface Service {
    boolean isReadyOnService();

    int getIsReadyTimeToService();

    void addTimeOnService(int additionalTime);
}