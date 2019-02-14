package org.springframework.samples.petclinic.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
class WelcomeController {

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        String temp = "9";
        String min = "8";
        String max = "7";

        model.put("temp", temp);
        model.put("min", min);
        model.put("max", max);
        return "welcome";
    }
}
