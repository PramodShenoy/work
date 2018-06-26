package com.cf;
import java.util.List;

import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MyController {

    @Autowired
    CityService cityService;

    @RequestMapping("/showCities")
    public String findCities(Model model) {

        List<City> cities = (List<City>) cityService.findAll();
        System.out.println(cities.get(0).toString());
        model.addAttribute("cities", cities);

        return "showCities";
    }
}
