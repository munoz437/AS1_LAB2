package gt.edu.umg.ingenieria.sistemas.calculator.util;

import java.util.*;

public class TriangleFunctions extends FigureFunctions {

    public TriangleFunctions() {
    }

    public double calculateTriangleArea(double base, double height) {
        
        return (base*height)/2;
    }

    public double calculateTrianglePerimeter(double sideA, double sideB, double sideC) {
      
        return sideA+sideB+sideC;
    }

}