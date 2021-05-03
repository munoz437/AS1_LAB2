package gt.edu.umg.ingenieria.sistemas.calculator.util;

import java.util.*;


public class SquareFunctions extends FigureFunctions {

  
    public SquareFunctions() {
    }

    public double calculateSquareArea(double side) {
      
        return side*side;
    }

    public double calculateSquarePerimeter(double side) {
        
        return 4*side;
    }

}