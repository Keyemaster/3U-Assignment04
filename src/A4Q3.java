
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create the input for the user
        Scanner input = new Scanner(System.in);
        
        //set number to 0
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double number4 = 0;
        //ask user for numbers
        System.out.println("Please enter in 4 numbers on seperate lines");
        //get the number from the user
        number1 =  (input.nextDouble());
        number2 =  (input.nextDouble());
        number3 =  (input.nextDouble());
        number4 =  (input.nextDouble());
        //tell user what their numbers were
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + " and " + number4);
        
    }
}
