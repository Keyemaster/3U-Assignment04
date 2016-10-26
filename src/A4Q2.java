
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create the input for the user
        Scanner input = new Scanner(System.in);
        
        //set measurement to 0
        double measurement = 0;
        //ask user for measurement
        System.out.println("Please enter the measurement in inches you wish to convert to cm ");
        measurement =  (input.nextDouble()*2.54);
        //convert the measurement
        System.out.println(measurement/2.54 + " inches is the same as " + measurement + " cm");
        
        
    }
}
