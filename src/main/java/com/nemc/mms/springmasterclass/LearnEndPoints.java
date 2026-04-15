package com.nemc.mms.springmasterclass;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn/apis/endpoints")
public class LearnEndPoints {
    // get
    @GetMapping("/get-hello")
    @ResponseStatus(HttpStatus.OK)
    public HelloResponse get() {
        return new HelloResponse("Hello from Spring Master Class");
    }
    // post
    // put
    // patch
    // delete

    public record HelloResponse(String message) {
    }
}

