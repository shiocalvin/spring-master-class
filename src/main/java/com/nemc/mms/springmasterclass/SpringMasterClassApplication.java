package com.nemc.mms.springmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class SpringMasterClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMasterClassApplication.class, args);
    }

}

// properties -- yaml basic
// profiles -- dev, prod, test
// configuration properties -- @ConfigurationProperties --> @Value
// maven package manager -->  properties
// rest-end-poinst
// validation jakarta