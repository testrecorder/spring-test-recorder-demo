package com.onushi.springtestrecorder.demo;

import com.onushi.testrecorder.aspect.RecordTest;
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

    public DemoPerson loadPerson(int id) throws Exception {
        return demoPersonRepository.getPersonFromDB(id);
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

    public String getPersonFirstName(int id) {
        try {
            DemoPerson demoPerson = demoPersonRepository.getPersonFromDB(id);
            return demoPerson.getFirstName();
        } catch (Exception ex) {
            return null;
        }
    }
}

