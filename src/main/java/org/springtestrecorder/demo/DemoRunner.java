/*
 *
 * Copyright (c) 2021 spring-test-recorder contributors
 * This program is made available under the terms of the MIT License.
 *
 */

package org.springtestrecorder.demo;

import org.springtestrecorder.demo.example1.DemoService;
import org.springtestrecorder.demo.example2.DemoPerson;
import org.springtestrecorder.demo.example2.DemoPersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class DemoRunner implements CommandLineRunner {
    private final DemoPersonService demoPersonService;
    private final DemoService demoService;

    public DemoRunner(DemoPersonService demoPersonService, DemoService demoService) {
        this.demoPersonService = demoPersonService;
        this.demoService = demoService;
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

        Date minDate = demoService.minDate(firstDate, secondDate);
    }


    private void runExample2() throws Exception {
        List<Integer> personIds = new ArrayList<>();
        personIds.add(1);
        personIds.add(2);

        Map<Integer, DemoPerson> personMap = demoPersonService.loadPersons(personIds);
    }
}
