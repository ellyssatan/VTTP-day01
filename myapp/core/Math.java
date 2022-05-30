package myapp.core;

import java.io.Console;

public class Math {
    public static void main(String[] args) {
        Console cons = System.console();

        int num1 = Integer.parseInt(cons.readLine("Operand 1\n"));
        int num2 = Integer.parseInt(cons.readLine("Operand 2\n"));
        
        String operator = cons.readLine("Operator\nChoose between add, div, sub, mul: ").trim();

        if (operator.equals("add")) {
            System.out.println("The answer for " + num1 + " + " + num2 + " = " + (num1 + num2));

        } else if (operator.equals("div")) {
            float nF1 = num1;
            float nF2 = num2;
            System.out.printf("The answer for " + num1 + " / " + num2 + " = " + (nF1/nF2));

        } else if (operator.equals("sub")) {
            System.out.println("The answer for " + num1 + " - " + num2 + " = " + (num1 - num2));
    
        } else if (operator.equals("mul")) {
            System.out.println("The answer for " + num1 + " * " + num2 + " = " + (num1 * num2));
            
        } else {
            System.out.println("Invalid Operator, try again");
        }
    }
}
