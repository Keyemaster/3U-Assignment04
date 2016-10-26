
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create the input for the user
        Scanner input = new Scanner(System.in);
        
        //set variables to 0
        double food = 0;
        double DJ = 0;
        double rent = 0;
        double decorations = 0;
        double staff = 0;
        double miscellaneous = 0;
        double total = 0;
        int tickets = 0;
        double ticketprice = 35;
        //ask user for cost of food
        System.out.println("How much does the food for prom cost?");
        food =  (input.nextDouble());
        //ask user for cost of DJ
        System.out.println("How much does the DJ cost?");
        DJ =  (input.nextDouble());
        //ask user for cost of rent
        System.out.println("How much does it cost to rent the hall?");
        rent =  (input.nextDouble());
        //ask user for cost of decorations
        System.out.println("How much does the decorations cost?");
        decorations =  (input.nextDouble());
        //ask user for cost of staff
        System.out.println("How much does it cost for staff?");
        staff =  (input.nextDouble());
        //ask user for cost of miscellaneous
        System.out.println("How much for miscellaneous costs?");
        miscellaneous =  (input.nextDouble());
        //find the total cost
        total = food + DJ + rent + decorations + staff + miscellaneous;
        //find the amount of tickets needed to break even
        tickets = (int) Math.ceil(total/ticketprice);
        //tell user what the total is and how many tickets are required to break even
        System.out.println("The total cost is $" + total + ". " + "You will need to sell " + tickets + " tickets to break even." );
        
    }
}
