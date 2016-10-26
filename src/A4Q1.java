
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create the input for the user
        Scanner input = new Scanner(System.in);
        
        //ask user for their name
        System.out.println("Please enter your name");
        //get the name from the user
        String name = input.nextLine();
        //say hello and how are you today
        System.out.println("Hello " + name + " How are you today?");
        
    }
}
