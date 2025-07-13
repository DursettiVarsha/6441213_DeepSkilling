package com.cognizant.countrylookup.service;

import com.cognizant.countrylookup.model.Country;
import org.springframework.stereotype.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) {
        try (ClassPathXmlApplicationContext ctx =
                 new ClassPathXmlApplicationContext("countries.xml")) {

            @SuppressWarnings("unchecked")
            List<Country> countries = (List<Country>) ctx.getBean("countryList");

            return countries.stream()
                    .filter(c -> c.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElse(null);
        }
    }
}
