
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keyew7019
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create the input for the user
        Scanner input = new Scanner(System.in);

        //set plans to 0
        double planA = 0;
        double planB = 0;
        double daytimeA = 0;
        double daytimeB = 0;
        double eveningA = 0;
        double eveningB = 0;
        double weekendA = 0;
        double weekendB = 0;
        double minutes1 = 0;
        double minutes2 = 0;
        double minutes3 = 0;
        //get the number of daytime minutes
        System.out.println("Number of daytime minutes?");
        minutes1 = (input.nextDouble());
        //get the number of evening minutes
        System.out.println("Number of evening minutes?");
        minutes2 = (input.nextDouble());
        //get the number of weekend minutes
        System.out.println("Number of weekend minutes?");
        minutes3 = (input.nextDouble());
        
        //create the planA cell phone plan
        if (minutes1 > 100) {
            daytimeA = ((minutes1 - 100) * 0.25);
        }
        if (minutes2 > 0) {
            eveningA = (minutes2 * 0.15);
        }
        if (minutes3 > 0) {
            weekendA = (minutes3 * 0.20);
        }
        //create the planB cell phone plan
        if (minutes1 > 250) {
            daytimeB = ((minutes1 - 250) * 0.45);
        }
        if (minutes2 > 0) {
            eveningB = (minutes2 * 0.35);
        }
        if (minutes3 > 0) {
            weekendB = (minutes3 * 0.25);
        }

        //find the totals
        planA = daytimeA + eveningA + weekendA;
        planB = daytimeB + eveningB + weekendB;
        //display totals
        System.out.println("Plan A costs " + planA);
        System.out.println("Plan B costs " + planB);

        //find which plan is cheaper
        if(planA == planB){
            System.out.println("Plan A and B are the same price");
        }
        if (planA > planB) {
            System.out.println("Plan B is cheapest");
        }
        if (planA < planB) {
            System.out.println("Plan A is cheapest");
        }


    }
}
