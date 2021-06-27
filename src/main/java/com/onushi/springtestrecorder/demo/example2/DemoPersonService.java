/*
 *
 * Copyright (c) 2021 spring-test-recorder contributors
 * This program is made available under the terms of the MIT License.
 *
 */

package com.onushi.springtestrecorder.demo.example2;

import com.onushi.springtestrecorder.aspect.RecordTest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DemoPersonService {
    private final DemoPersonRepository demoPersonRepository;

    public DemoPersonService(DemoPersonRepository demoPersonRepository) {
        this.demoPersonRepository = demoPersonRepository;
    }

    @RecordTest
    public Map<Integer, DemoPerson> loadPersons(List<Integer> personIds) throws Exception {
        Map<Integer, DemoPerson> result = new HashMap<>();
        if (personIds != null) {
            for (Integer personId : personIds) {
                DemoPerson demoPerson = demoPersonRepository.getPersonFromDB(personId);
                result.put(personId, demoPerson);
            }

        }
        return result;
    }
}

