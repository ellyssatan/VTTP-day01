package myapp.core;

import java.io.Console;

public class Greetings {
    // entry point
    public static void main(String[] args) {
        // Get console
        Console cons = System.console();
        
        // Read from input
        String name = cons.readLine("What is your name?\n");
        // printf (print format) %s = placeholder for string
        if (name.trim().length() > 0) {
            System.out.printf("Hello %s. Nice to meet you.\n", name.toUpperCase());
        } else {
            System.err.println("You have not told me your name");
        }
        
        String age = cons.readLine("How old are you?\n");
        age = age.trim();
        if (age.length() > 0) {
            System.out.printf("Wow, you are %s", age);
        } else {
            System.out.println("Please input age");
        }


        //String name = cons.readLine("What is your name?\n");
    }
}
