/*
 *
 * Copyright (c) 2021 spring-test-recorder contributors
 * This program is made available under the terms of the MIT License.
 *
 */

package com.onushi.springtestrecorder.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;
import static org.mockito.Mockito.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

class DemoPersonServiceTest {
    //Test Generated on 2021-06-17 09:47:21.494 with @RecordTest
    //TODO rename the test to describe the use case
    //TODO refactor the generated code to make it easier to understand
    @Test
    void loadPersons() throws Exception {
        // Arrange
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        List<Integer> arrayList1 = Arrays.asList(1, 2);

        Date date1 = simpleDateFormat.parse("1940-03-10 00:00:00.000");
        DemoPerson demoPerson1 = DemoPerson.builder()
                .dateOfBirth(date1)
                .firstName("Chuck")
                .lastName("Norris")
                .build();

        Date date2 = simpleDateFormat.parse("1940-11-27 00:00:00.000");
        DemoPerson demoPerson2 = DemoPerson.builder()
                .dateOfBirth(date2)
                .firstName("Bruce")
                .lastName("Lee")
                .build();

        DemoPersonRepositoryImpl demoPersonRepositoryImpl = mock(DemoPersonRepositoryImpl.class);
        when(demoPersonRepositoryImpl.getPersonFromDB(1)).thenReturn(demoPerson1);
        when(demoPersonRepositoryImpl.getPersonFromDB(2)).thenReturn(demoPerson2);

        DemoPersonService demoPersonService = new DemoPersonService(demoPersonRepositoryImpl);

        // Act
        Map<Integer, DemoPerson> result = demoPersonService.loadPersons(arrayList1);

        // Assert
        assertEquals(2, result.size());
        assertEquals(demoPerson1, result.get(1));
        assertEquals(demoPerson2, result.get(2));
    }
}
