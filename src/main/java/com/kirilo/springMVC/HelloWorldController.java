package com.kirilo.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(Locale locale, Model model){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String format = dateFormat.format(date);
        model.addAttribute("serverTime", format);
        return "home";
    }
}
