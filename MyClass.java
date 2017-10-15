
package ProgrammingAssignment;

/**
 * @author Fatemeh MK
 * Created: October 14, 2017
 * Last modified:
 */

import java.util.Scanner;
        
public class MyClass {

    static String choice; //made it static so error doesnt happen when assigning
    
    public static void main(String[] args) {

     System.out.println("Hi there!\nThis program will calculate the area of a 2D shape of your choice");
     
     while (true){
         
        System.out.println("Choose a shape(type the full name or first 4 letters of the shape):\n Circle\n Rectangle\n Triangle");
        
        Scanner input = new Scanner(System.in);
        
        choice = input.nextLine(); //stores the shape they wish to calculate
        
        //determines which shape is chosen and acts accordingly        
        switch (choice){
            
            //If circle was chosen
            case 1: choice.equals("circle"); 
                Circle circ= new Circle();
                System.out.println("The area of a circle is found by squaring its radius and multiplying it by the number Pi");
                System.out.println("Please provide the required measurements\n Radius:");
                circ.radius = input.nextDouble();
                System.out.println("The area of the circle is" + circ.area());
             
                
            //If rectangle was chosen    
            case 2: choice.equals("rectangle"); 
                Rectangle rect= new Rectangle();
                System.out.println("The area of a rectangle is found by multiplying its length and width by each other");
                System.out.println("Please provide the required measurements");
                
                System.out.println("Length:");
                rect.length = input.nextDouble();
                System.out.println("Width:");
                rect.width = input.nextDouble();
                
                System.out.println("The area of the rectacnle is" + rect.area());
         
            //If triangle was chosen
            case 3: choice.equals("triangle"); 
                Triangle tria = new Triangle();
                System.out.println("The area of a triangle is found by multiplying its base and height by each other, and then dividing the product by 2");
                System.out.println("Please provide the required measurements");   
                
                System.out.println("Base:");
                tria.base = input.nextDouble();
                System.out.println("Height:");
                tria.height = input.nextDouble();
                
                System.out.println("The area of the triangle is" + tria.area());
            
            default: 
                System.out.println("Invalid choice ;(");
                continue;
        
        //this block of code is unreachable but idk why
        System.out.println("Do you wish to calculate another area?(yes/no)");
        choice = input.nextLine();
        
        if (choice.equals("yes") || choice.equals("y")){
            continue;
                    
        }else {
            break;
        }
        
        
         
            
                        
                                
                                
        }
        
        
        
        
                
     }  
             


    }
    
    
}
