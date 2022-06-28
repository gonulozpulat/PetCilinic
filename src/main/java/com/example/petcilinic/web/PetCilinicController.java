package com.example.petcilinic.web;

import com.example.petcilinic.service.PetClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PetCilinicController {

    @Autowired
    private PetClinicService petClinicService;

    @RequestMapping("/owners")
    @ResponseBody
    public ModelAndView getOwners(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("owners", petClinicService.findOwners());
        modelAndView.setViewName("owners");
        return  modelAndView;
    }

    @RequestMapping("/pcs")
    @ResponseBody
    public String welcome(){
        return "Welcome to PetCilinic World!";
    }
}
