package gt.edu.umg.ingenieria.sistemas.calculator.model;

import java.util.*;


public class TriangleEntity extends FigureEntity {

    
    public TriangleEntity() {
    }

 
    private double base;

   
    private double height;

    
    private double sideA;

   
    private double sideB;

    private double sideC;

   
    public double getBase() {
        
        return base;
    }

 
    public void setBase(double base) {
       this.base=base;
    }

    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
       this.height=height;
    }

    
    public double getSideA() {
       
        return sideA;
    }

    
    public void setSideA(double sideA) {
       this.sideA=sideA;
    }

   
    public double getSideB() {
       
        return sideB;
    }

    public void setSideB(double sideB) {
       
        this.sideB=sideB;
    }

  
    public double getSideC() {
       
        return sideC;
    }

    
    public void setSideC(double sideC) {
        this.sideC=sideC;
    }

}