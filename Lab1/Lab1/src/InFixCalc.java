package Lab1;
import javax.swing.text.html.parser.Parser;
import java.util.Scanner;
import java.util.*;
import java.util.StringTokenizer;
/*
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * Exercise author: Rob Nash
 * Complete the calculate() function below to build a simple, infix
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 *
 * Example: " 1 * -3 + 6 / 3"
 * Execution: calculate 1 * -3 first, then -3 + 6 next, then 3 / 3
 * last to obtain the value 1
*
* Solution by 
*/
public class InFixCalc {
    //example pattern: "3 + 5"
    //general pattern: <lhs='3'> <operation='+'> <rhs='5'> //extended pattern:     ...  
    //special case: 
    //other special cases?

    public static void main(String[] args) { //String input = "4 + 4";
        //String input = "4 + 4 / 2";
        //String input ="1 * -3";
        String input ="1 * -3 + 6 / 3";
        //String input ="5";
        //String input ="-5";

        int answer = calculate(input);
        System.out.println("Answer is " + answer);
    }

    //preconditions: all binary operations are separated via a space
    //postconditions: returns the result of the processed string
    public static int calculate(String input) {
        int lhs = 0; //short for left-hand side
        int rhs = 0; //short for right-hand side
        char operation;
        /*todo: your name and code goes here: Maxim Capcanari*/
        /*You need a Scanner(or StringTokenizer) to get tokens
          *Then you need a loop, and switch inside that loop*/
        StringTokenizer st = new StringTokenizer(input, " ");
            lhs = Integer.parseInt(st.nextToken());
            operation = st.nextToken().charAt(0);
            rhs = Integer.parseInt(st.nextToken());

            while (st.hasMoreTokens()){
                switch (operation){
                    case '+':
                        lhs = lhs + rhs;
                        break;
                    case '-':
                        lhs = lhs - rhs;
                        break;
                    case '*':
                        lhs = lhs * rhs;
                        break;
                    case '/':
                        lhs = lhs / rhs;
                        break;
                }
                operation = st.nextToken().charAt(0);
                rhs = Integer.parseInt(st.nextToken());
            }

            // Here I realized that even after it reaches the end of the "input" string it still needs to perform the operation one more time
        switch (operation){
            case '+':
                lhs = lhs + rhs;
                break;
            case '-':
                lhs = lhs - rhs;
                break;
            case '*':
                lhs = lhs * rhs;
                break;
            case '/':
                lhs = lhs / rhs;
                break;
        }

        return lhs;
    }
}
