package sg.edu.nus.iss.d12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping(path = {"/indexresource", "/indexresource.html"})
public class IndexResource {
    
    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        model.addAttribute("currTime", (new Date()).toString());

        Calendar cal = Calendar.getInstance();
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));
        
        return "indexresource";
    }

}
