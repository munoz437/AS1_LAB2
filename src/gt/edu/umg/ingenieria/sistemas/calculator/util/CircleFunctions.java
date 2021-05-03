package gt.edu.umg.ingenieria.sistemas.calculator.util;

import java.util.*;

public class CircleFunctions extends FigureFunctions {

    public CircleFunctions() {
    }

    
    public double calculateCircleArea(double radius) {
   
        return Math.PI*Math.pow(radius,2);
    }

    
    public double calculateCirclePerimeter(double radius) {
      
        return 2*Math.PI*radius;
    }

}