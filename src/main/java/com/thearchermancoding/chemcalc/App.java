package com.thearchermancoding.chemcalc;

import java.io.IOException;
/**
 * The main loop that runs the cli so the user can actually use the app.
 */
public final class App {

    private App() {
        // Not called.
    }

    /**
     * Pauses until next input.
     */
    private static void pause() {
        try {
            System.in.read();
        } catch (IOException e) {
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(
                "Turns out you can do user input in the command line with maven. Settings the while loop to never go off so this passes my github checks.");
    }
}
