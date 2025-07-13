package com.cognizant.countrylookup.controller;

import com.cognizant.countrylookup.model.Country;
import com.cognizant.countrylookup.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountry(@PathVariable String code) {
        LOGGER.info("START - getCountry({})", code);
        Country result = countryService.getCountry(code);
        LOGGER.info("END - getCountry({})", code);

        return (result == null)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(result);
    }
}
