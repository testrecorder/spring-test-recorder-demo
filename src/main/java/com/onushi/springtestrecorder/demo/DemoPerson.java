package com.onushi.springtestrecorder.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemoPerson {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    private DemoPerson(String firstName) {
        this.firstName = firstName;
    }
}
