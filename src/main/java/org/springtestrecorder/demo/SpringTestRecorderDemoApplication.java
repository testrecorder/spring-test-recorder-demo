/*
 *
 * Copyright (c) 2021 spring-test-recorder contributors
 * This program is made available under the terms of the MIT License.
 *
 */

package org.springtestrecorder.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.springtestrecorder.demo", "org.springtestrecorder"})
public class SpringTestRecorderDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringTestRecorderDemoApplication.class, args);
    }
}
