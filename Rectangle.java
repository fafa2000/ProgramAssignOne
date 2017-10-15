
package ProgrammingAssignment;

/**
 * @author Fatemeh
 */

public class Rectangle extends Shape{
    public double length, width; //sides
    
    @Override
    public double area () {
        return length*width; //calculates area of a rectangle
    }
    
    
    
}