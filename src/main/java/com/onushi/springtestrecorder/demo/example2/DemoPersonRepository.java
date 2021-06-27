/*
 *
 * Copyright (c) 2021 spring-test-recorder contributors
 * This program is made available under the terms of the MIT License.
 *
 */

package com.onushi.springtestrecorder.demo.example2;

import java.text.ParseException;
import java.util.NoSuchElementException;

public interface DemoPersonRepository {
    DemoPerson getPersonFromDB(int id) throws NoSuchElementException, ParseException;
}
