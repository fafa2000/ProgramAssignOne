
package ProgrammingAssignment;

/**
 * @author Fatemeh
 */

public class Triangle extends Shape{
    public double base, height;
    
    @Override
    public double area (){
        return (base*height)/2;  //calculates area of a triangle
    }
    
}
