package Exercise;
import java.lang.Math.*;
public class Exercise2 {
    public static void main(String[] args) {
        exercise2();
    }

    private static void exercise2() {
        /*
        Task: check whether each of a list of integer is power of 2
        Input: a list of integers
        Output: true or false
        Logic: return TRUE if a given number is a power of 2, such as 2, 4, 8, and return FALSE otherwise
        Validation: test your function up to at least 128
        Additional improvement: make your code run as fast as possible
         */
        //TODO: add your code

        int[] list= {1,2,3,4,65,74,256,-256,0,16};
        int test;
        for (int i = 0; i < list.length; i++) {
            test = 2;
            while(test < list[i]){
                test = (int) Math.pow(test,2);
            }
               if (test == list[i]){
                   System.out.println("Yes");
               } else {
                   System.out.println("No");
               }
            }

        }

    }
