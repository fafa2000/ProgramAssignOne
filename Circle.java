
package ProgrammingAssignment;

/**
 * @author Fatemeh
 */

import java.lang.Math;
        
public class Circle extends Shape{

    public double radius;
    final double pi = Math.PI;
    
    @Override
    public double area (){
        return pi * Math.pow(radius,2); //calculates area of a circle
    }
    
    
    
    
    
    
}
