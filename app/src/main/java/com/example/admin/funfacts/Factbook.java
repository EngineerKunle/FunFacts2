package com.example.admin.funfacts;

import java.util.Random;

/**
 * Created by Admin on 12/12/2014.
 */
public class Factbook {
    // Member variable (properties about the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Can kunle do it ",
            "yes he can",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "Kunle soon learn Javascript",
            "Some penguins can leap 2-3 meters out of the water.",
            "kunle best android developer",
            "Kunle rules." };

    // Method (abilities: things the object can do)
    public String getFact() {

        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }

}
