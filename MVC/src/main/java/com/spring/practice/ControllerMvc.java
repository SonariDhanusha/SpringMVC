package com.spring.practice;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMvc {
 @RequestMapping("/")

    public String getHome(){
        System.out.println("home called");
        return  "home.jsp";
    }

    @PostMapping(value="/addcustomer")
    public String addcustomer(@RequestParam String Fname, @RequestParam String Lname, @RequestParam String email, Model model){
        System.out.println("add customer triggered");
//        System.out.println(Fname + " " + Lname + " " + email );
        model.addAttribute("Fname", Fname);
        model.addAttribute("Lname", Lname);
        model.addAttribute("email", email);
        return  "success.jsp";
    }
}
