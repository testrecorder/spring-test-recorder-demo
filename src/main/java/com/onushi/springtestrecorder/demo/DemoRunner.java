/*
 *
 * Copyright (c) 2021 spring-test-recorder contributors
 * This program is made available under the terms of the MIT License.
 *
 */

package com.onushi.springtestrecorder.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// TODO IB !!!! add simple example and complex example
// TODO IB !!!! add a README.md for the demo
// TODO IB !!!! can I have more README.md to avoid having too much content in a single page?
@Component
public class DemoRunner implements CommandLineRunner {
    private final DemoPersonService demoPersonService;

    public DemoRunner(DemoPersonService demoPersonService) {
        this.demoPersonService = demoPersonService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.demo1();
    }

    public void demo1() throws Exception {
        List<Integer> personIds = new ArrayList<>();
        personIds.add(1);
        personIds.add(2);

        Map<Integer, DemoPerson> personMap = this.demoPersonService.loadPersons(personIds);
    }
}
