package sg.edu.nus.iss.d12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path={ "/weather"})
public class WeatherController {
    
    @GetMapping
    public String weather(
        @RequestParam(required = true) String city, 
        @RequestParam(name = "units", defaultValue = "kilometres") String units,
        Model model) {

        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";

    }

    @GetMapping("{city}")
    public String weather2(
        @PathVariable(name = "city", required = true) String city,
        @RequestParam(name = "units", defaultValue = "kilometres") String units,
        Model model
    ) {

        model.addAttribute("city", city);
        model.addAttribute("units", units);
        
        return "weather";

    }


}
