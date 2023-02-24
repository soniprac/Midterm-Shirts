package soniprac.midterm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import soniprac.midterm.model.Shirtcolor;

@Controller
public class GameController {

    //returns main input page
    @GetMapping(value = {"/"})
    public String getHome(){
        return "input";
    }

    @GetMapping("/input")
    public ModelAndView getInput(@ModelAttribute("shirtColor") Shirtcolor shirtcolor,
                                 @RequestParam(value = "white",required = false) String white,
                                 @RequestParam(value = "blue",required = false) String blue,
                                 @RequestParam(value = "yellow",required = false) String yellow,
                                 @RequestParam(value = "green", required = false) String green) {

        ModelAndView model = new ModelAndView("output");
        if(white != null){
            System.out.println(white);
        } else if (blue != null) {
            System.out.println(blue);
        } else if (yellow != null) {
            System.out.println(yellow);
        } else if (green != null) {
            System.out.println(green);
        }
        return model;
    }
}
