
package ProgrammingAssignment;

/**
 * @author Fatemeh MK
 * Created: October 14, 2017
 * Last modified:
 */

import java.util.Scanner
        
public class MyClass {

    String choice; //error happens in code cause this is non-static
    
    public static void main(String[] args) {

     System.out.println("Hi there!\nThis program will calculate the area of a 2D shape of your choice");
     
     while (true){
         
        System.out.println("Choose a shape(:\n A.Circle\n B.Rectangle\n C.Triangle");
        
        Scanner input = new Scanner(System.in);
        
        choice = input.next(); //stores the shape they wish to calculate
        
        //determines which shape is chosen and acts accordingly        
        switch (choice){
            
            case 1: choice == 'A'; //If circle was chosen
                Circle circ= new Circle()
                System.out.println("The area of a circle is found by squaring its radius and multiplying it by the number Pi");
                System.out.println("Please provide the required measurements\n Radius:");
                circ.radius = input.nextDouble();
                System.out.println("The area of the circle is" + circ.area());
                
            case 2: choice == 'B'; //If rectangle was chosen
                Rectangle rect= new Rectangle()
                System.out.println("The area of a rectangle is found by multiplying its length and width by each other");
                System.out.println("Please provide the required measurements");
                
                System.out.println("Length:");
                rect.length = input.nextDouble();
                System.out.println("Width:");
                rect.width = input.nextDouble();
                
                System.out.println("The area of the rectacnle is" + rect.area());
         
            
            case 3: choice == 'C'; //If triangle was chosen
                Triangle tria = new Triangle();
                System.out.println("The area of a triangle is found by multiplying its base and height by each other, and then dividing the product by 2");
                System.out.println("Please provide the required measurements");   
                
                System.out.println("Base:");
                tria.base = input.nextDouble();
                System.out.println("Height:");
                tria.height = input.nextDouble();
                
                System.out.ptintln("The area of the triangle is" + tria.area());
            
            default: 
                System.out.println("Invalid choice ;(");
                continue;
                
        System.out.println("Do you wish to calculate another area?(yes/no)");
        choice = input.nextLine();
        
        if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")){
            continue;
                    
        }else {
            break;
        }
        
        
         
            
                        
                                
                                
        }
        
        
        
        
                
     }  
             


    }
    
    
}
