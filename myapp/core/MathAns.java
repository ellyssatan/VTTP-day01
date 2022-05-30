package myapp.core;

import java.io.Console;

public class MathAns {
    public static void main(String[] args) {
        Console cons = System.console();

        // opnd1
        String opnd1 = cons.readLine("Operand 0: ").trim();
        // opnd2
        String opnd2 = cons.readLine("Operand 1: ").trim();

        String operator = cons.readLine("Operator\nChoose between add, div, sub, mul: ").trim();

        // convert string to int
        Integer val0 = Integer.parseInt(opnd1);
        Integer val1 = Integer.parseInt(opnd2);
        Float result = 0f; //float

        // perform calculation
        switch (operator) {
            case "add":
                // Cast/force that type
                result = (float)(val0 + val1);
                break;

            case "sub":
                result = (float)(val0 - val1);
                break;

            case "mul":
                result = (float)(val0 * val1);
                break;
            
            case "div":
                result = (float)(val0) / val1;
                break;
            
            default:
        }
        System.out.printf("Result: %d %s %d = %.3f", val0, operator, val1, result);
    }
}
