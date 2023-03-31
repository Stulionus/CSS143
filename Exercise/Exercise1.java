package Exercise;

public class Exercise1 {
    public static void main(String[] args) {

        int x = 123, y = 567;

        /*
        Task: swap the values in two variables
        Input: two Integer variables
        Output: nothing
        Logic: the values of the 2 variables should be exchanged
        Validation: 5 test cases at least
        Additional improvement: Is it possible to not use any other variable at all for the swap?
         */
        //TODO: add your code

        int tempVariable;

        //Test 1
        System.out.println( "Was: " + " x = " + x + ", y = " + y);
        tempVariable = x;
        x=y;
        y=tempVariable;
        System.out.println("Now: " + "x = " + x + ", y = " + y);

        x = 14;
        y = 23;

        System.out.println();

        //Test 2
        System.out.println( "Was: " + " x = " + x + ", y = " + y);
        tempVariable = x;
        x=y;
        y=tempVariable;
        System.out.println("Now: " + "x = " + x + ", y = " + y);

        x = 0;
        y = 3;

        System.out.println();

        //Test 3
        System.out.println( "Was: " + " x = " + x + ", y = " + y);
        tempVariable = x;
        x=y;
        y=tempVariable;
        System.out.println("Now: " + "x = " + x + ", y = " + y);

        x = 16;
        y = 16;

        System.out.println();

        //Test 4
        System.out.println( "Was: " + " x = " + x + ", y = " + y);
        tempVariable = x;
        x=y;
        y=tempVariable;
        System.out.println("Now: " + "x = " + x + ", y = " + y);

        x = -4;
        y = -7;

        System.out.println();

        //Test 5
        System.out.println( "Was: " + " x = " + x + ", y = " + y);
        tempVariable = x;
        x=y;
        y=tempVariable;
        System.out.println("Now: " + "x = " + x + ", y = " + y);

        x = 0;
        y = -7;

        System.out.println();

        //Test 6
        System.out.println( "Was: " + " x = " + x + ", y = " + y);
        tempVariable = x;
        x=y;
        y=tempVariable;
        System.out.println("Now: " + "x = " + x + ", y = " + y);
    }
}
