/*
 *
 * Copyright (c) 2021 spring-test-recorder contributors
 * This program is made available under the terms of the MIT License.
 *
 */

package com.onushi.springtestrecorder.demo;

import com.onushi.springtestrecorder.demo.example1.SampleService;
import com.onushi.springtestrecorder.demo.example2.DemoPerson;
import com.onushi.springtestrecorder.demo.example2.DemoPersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

// TODO IB !!!! add simple example and complex example
@Component
public class DemoRunner implements CommandLineRunner {
    private final DemoPersonService demoPersonService;
    private final SampleService sampleService;

    public DemoRunner(DemoPersonService demoPersonService, SampleService sampleService) {
        this.demoPersonService = demoPersonService;
        this.sampleService = sampleService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.runExample1();
        this.runExample2();
    }

    private void runExample1() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date firstDate = simpleDateFormat.parse("2021-01-01");
        Date secondDate = simpleDateFormat.parse("2021-02-02");

        Date minDate = sampleService.minDate(firstDate, secondDate);
    }


    private void runExample2() throws Exception {
        List<Integer> personIds = new ArrayList<>();
        personIds.add(1);
        personIds.add(2);

        Map<Integer, DemoPerson> personMap = demoPersonService.loadPersons(personIds);
    }
}
