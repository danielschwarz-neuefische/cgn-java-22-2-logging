package com.example.cgnjava222logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping(path = "pub")
    String pub() {
        logger.info("Someone made a request");
        logger.debug("Debug-Info...");
        return "Hello";
    }
}
