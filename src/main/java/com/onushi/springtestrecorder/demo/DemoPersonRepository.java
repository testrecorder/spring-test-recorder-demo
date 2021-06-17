package com.onushi.springtestrecorder.demo;

public interface DemoPersonRepository {
    DemoPerson getPersonFromDB(int id) throws Exception;

    int getPersonsCountFromDB(String firstParam, String secondParam);
}
