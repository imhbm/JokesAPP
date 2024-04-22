package com.dillsedeveloper.joke.service;

import org.springframework.stereotype.Service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 *
 *@Project joke
 *@author IHBM on 4/22/2024
 *
 */
@Service
public class ComedyService {
    private static final Logger serverLogger = LoggerFactory.getLogger("com.dillsedeveloper.joke.server");
    private static final Logger consoleLogger = LoggerFactory.getLogger("com.dillsedeveloper.joke.console");

    // declare a simple String array of length 10
    private String[] jokes = new String[10];
    public ComedyService() {
        populateJokes();
    }
   public String getRandomJoke() {
        Random r = new Random();
        int i = r.nextInt(10);
       serverLogger.info("Server Log: Generated random joke");
       consoleLogger.debug("Console Log: Random joke - {}", jokes[i]);
        return jokes[i];
    }

    private void populateJokes() {
        jokes[0] = "Q1: Did you hear about the mathematician who’s afraid of negative numbers? " +
                "\n\nA1: He'll stop at nothing to avoid them.";
        jokes[1] = "Q2: How many programmers does it take to change a light bulb?" +
                "\n\nA2: none, that's a hardware problem";
        jokes[2] = "Q3: Why did the programmer quit their job?" +
                "\n\nA3: Because he didn't get arrays.";

        jokes[3] = "Q4: Did you hear about the mathematician who’s afraid of negative numbers? " +
                "\n\nA4: He'll stop at nothing to avoid them.";
        jokes[4] = "Q5: How many programmers does it take to change a light bulb?" +
                "\n\nA5: none, that's a hardware problem";
        jokes[5] = "Q6: Why did the programmer quit their job?" +
                "\n\nA6: Because he didn't get arrays.";
        jokes[6] = "Q7: Did you hear about the mathematician who’s afraid of negative numbers? " +
                "\n\nA7: He'll stop at nothing to avoid them.";
        jokes[7] = "Q8: How many programmers does it take to change a light bulb?" +
                "\n\nA8: none, that's a hardware problem";
        jokes[8] = "Q9: Why did the programmer quit their job?" +
                "\n\nA9: Because he didn't get arrays.";
        jokes[9] = "Q10: Did you hear about the mathematician who’s afraid of negative numbers? " +
                "\n\nA10: He'll stop at nothing to avoid them.";
    }
}
