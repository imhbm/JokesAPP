package com.dillsedeveloper.joke.controller;

import com.dillsedeveloper.joke.service.ComedyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 *
 *@Project joke
 *@author IHBM on 4/22/2024
 *
 */
@Controller
public class ComedyController {
    private static final Logger logger = LoggerFactory.getLogger(ComedyController.class);
    @Autowired
    ComedyService comedyService;
    @GetMapping("/comedy")
    public String comedy(Model model) {
        // get a random joke from the comedy service "bean"
        String joke = comedyService.getRandomJoke();
        // attach that joke to the data model
        // (insert the joke into the HTML that will be returned to user)
        model.addAttribute("joke", joke);
        logger.debug("Joke added to model: {}", joke);
        // return the view "getting_started/comedy.html"
        // this view can be found at "src/main/resources/templates/getting_started/comedy.html
        return "getting_started/comedy";
    }
}
