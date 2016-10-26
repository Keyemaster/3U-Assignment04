
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //create the input for the user
        Scanner input = new Scanner(System.in);
        
        //set number to 0
        double test1 = 0;
        double test2 = 0;
        double test3 = 0;
        double test4 = 0;
        double test5 = 0;
        double average = 0;
        //ask user for their name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        //ask for results of the first test
        System.out.println("What was the first test out of?");
        double number1 = input.nextDouble();
        System.out.println("What mark did you get?");
        double numeral1 = input.nextDouble();
        
        //ask for results of the second test
        System.out.println("What was the second test out of?");
        double number2 = input.nextDouble();
        System.out.println("What mark did you get?");
        double numeral2 = input.nextDouble();
        
        //ask for the results of the third test
        System.out.println("What was the third test out of?");
        double number3 = input.nextDouble();
        System.out.println("What mark did you get?");
        double numeral3 = input.nextDouble();
        
        //ask for the results of the fourth test
        System.out.println("What was the fourth test out of?");
        double number4 = input.nextDouble();
        System.out.println("What mark did you get?");
        double numeral4 = input.nextDouble();
        
        //ask for the results of the fifth test
        System.out.println("What was the fifth test out of?");
        double number5 = input.nextDouble();
        System.out.println("What mark did you get?");
        double numeral5 = input.nextDouble();
        //get the test results
        test1 =  (numeral1/number1);
        test2 =  (numeral2/number2);
        test3 =  (numeral3/number3);
        test4 =  (numeral4/number4);
        test5 =  (numeral5/number5);
        average =  ((test1 + test2 + test3 + test4 + test5)/5);
        //display the test scores for user
        System.out.println("Test Scores for " + name);
        System.out.println("Test 1: " + test1*100 + "%");
        System.out.println("Test 2: " + test2*100 + "%");
        System.out.println("Test 3: " + test3*100 + "%");
        System.out.println("Test 4: " + test4*100 + "%");
        System.out.println("Test 5: " + test5*100 + "%");
        System.out.println("Average: " + average*100 + "%");
        
    }
}
