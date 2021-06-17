package com.onushi.springtestrecorder.demo;

import com.onushi.testrecorder.aspect.RecordMockForTest;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.NoSuchElementException;


@RecordMockForTest
@Repository
public class DemoPersonRepositoryImpl implements DemoPersonRepository {
    @Override
    public DemoPerson getPersonFromDB(int id) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (id == 1) {
            return DemoPerson.builder()
                    .firstName("Chuck")
                    .lastName("Norris")
                    .dateOfBirth(simpleDateFormat.parse("1940-03-10"))
                    .build();

        } else if (id == 2) {
            return DemoPerson.builder()
                    .firstName("Bruce")
                    .lastName("Lee")
                    .dateOfBirth(simpleDateFormat.parse("1940-11-27"))
                    .build();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public int getPersonsCountFromDB(String firstParam, String secondParam) {
        return 2;
    }
}
