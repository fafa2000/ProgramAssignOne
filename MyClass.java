
package ProgrammingAssignment;

/**
 * @author Fatemeh MK
 * Created: October 14, 2017
 * Last modified: oct 16, 2017
 */

import java.util.Scanner;

public class MyClass {
    
    public static void main(String[] args) {

        System.out.println("Hi there!\nThis program will calculate the area of a 2D shape of your choice\n");
        try { 
            Thread.sleep(500); 
        } catch (InterruptedException e) {
        }       
        
        while (true){

           System.out.println("Choose a shape:\n a.Circle\n b.Rectangle (includes square)\n c.Triangle");
           Scanner input = new Scanner(System.in);
           String choice = input.next(); //stores the shape they wish to calculate

           
           //determines which shape is chosen and acts accordingly        
           switch (choice){

               //If circle was chosen
               case "a":  
                   Circle circ= new Circle();
                   System.out.println("\nThe area of a circle is found by squaring its radius and multiplying it by the number Pi.");
                   System.out.println("\nPlease provide the required measurements\n Radius:");
                   circ.radius = input.nextDouble();
                   
                   System.out.println("Calculating...");
                   try { 
                       Thread.sleep(1000); 
                   } catch (InterruptedException e) {
                   }
                   
                   System.out.println("\nThe area of the circle is " + String.format("%.2f", circ.area()));
                   break;

               //If rectangle was chosen    
               case "b": 
                   Rectangle rect= new Rectangle();
                   System.out.println("\nThe area of a rectangle is found by multiplying its length and width by each other.");
                   System.out.println("\nPlease provide the required measurements");
                   System.out.println("Length:");
                   rect.length = input.nextDouble();
                   System.out.println("Width:");
                   rect.width = input.nextDouble();
                   
                   System.out.println("Calculating...");
                   try { 
                       Thread.sleep(1000); 
                   } catch (InterruptedException e) {
                   }
                   
                   System.out.println("\nThe area of the rectangle is " + String.format("%.2f", rect.area()));
                   break;
                   
               //If triangle was chosen
               case "c": 
                   Triangle tria = new Triangle();
                   System.out.println("\nThe area of a triangle is found by multiplying its base and height by each other, and then dividing the product by 2.");
                   System.out.println("\nPlease provide the required measurements");   
                   System.out.println("Base:");
                   tria.base = input.nextDouble();
                   System.out.println("Height:");
                   tria.height = input.nextDouble();
                   
                   System.out.println("Calculating...");
                   try { 
                       Thread.sleep(1000); 
                   } catch (InterruptedException e) {
                   }
                   
                   System.out.println("\nThe area of the triangle is " + String.format("%.2f", tria.area()));
                   break;

               default: 
                   System.out.println("Invalid choice ;( \n");
                   continue ;
            }
           
           //so that the replay question doesnt appear rigt after the calculations are done
            try { 
                Thread.sleep(1700); 
            } catch (InterruptedException e) {
            }
            
            //to see if user wants to exit program or continue
            System.out.println("\nDo you wish to calculate another area?(y/n)");
            choice = input.next();
            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
                continue;
            }else {
                System.out.println("\nBye Bye!");
                break;
            }

           


        }  



    }
    
    
}
