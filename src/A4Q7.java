
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create the input for the user
        Scanner input = new Scanner(System.in);
        
        //set plans to 0
        double minutes1 = 0;
        double minutes2 = 0;
        double minutes3 = 0;
        
        //get the speed limit
        System.out.println("Enter the speed limit");
        minutes1 = (input.nextDouble());
        
        //get the speed of the car
        System.out.println("Enter the recorded speed of the car");
        minutes2 = (input.nextDouble());
        
        //get the difference of the speed of car to the speed limit
        minutes3 = (minutes2 - minutes1) + minutes1;
        
        //create the fines for speeding
        if(minutes3 <= minutes1){
            System.out.println("Congradulations, you are within the speed limit");
        }
        if(minutes3 >= minutes1 + 1 && minutes3 <= minutes1 + 20){
            System.out.println("You are speeding and your fine is $" + 100);
        }
        if(minutes3 >= minutes1 + 21 &&  minutes3 <= minutes1 + 30){
            System.out.println("You are speeding and your fine is $" + 270);
        }
        if(minutes3 >= minutes1 + 31){
            System.out.println("You are speeding and your fine is $" + 500);
        }
        
        
        
    }
}
