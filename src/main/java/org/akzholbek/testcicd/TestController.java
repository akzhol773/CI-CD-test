package org.akzholbek.testcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/data")
    public String getString(){
        return "Hello from Mars";
    }
}
