package com.cognizant.countryservice.controller;

import com.cognizant.countryservice.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia()");
        try (ClassPathXmlApplicationContext ctx =
                 new ClassPathXmlApplicationContext("country.xml")) {
            Country india = ctx.getBean("india", Country.class);
            LOGGER.info("END - getCountryIndia()");
            return india;              // <-- Jackson auto‑converts to JSON
        }
    }
}
