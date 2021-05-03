package gt.edu.umg.ingenieria.sistemas.calculator.model;

import java.util.*;


public abstract class FigureEntity {

   
    public FigureEntity() {
    }

    private String backgroundColor;

    private String borderColor;

    private double positionX;

    private double positionY;

    private String unit;

    public String getBackgroundColor() {
     
        return backgroundColor;
    }

  
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor=backgroundColor;
    }

    public String getBorderColor() {
       
        return borderColor;
    }

  
    public void setBorderColor(String borderColor) {
     this.borderColor=borderColor;
    }

   
    public double getPositionX() {
        // TODO implement here
        return positionX;
    }

  
    public void setPositionX(double positionX) {
       this.positionX=positionX;
    }

    
    public double getPositionY() {
       
        return positionY;
    }


    public void setPositionY(double positionY) {
       this.positionY=positionY;
    }

  
    public String getUnit() {
      
        return unit;
    }

    
    public void setUnit(String unit) {
        this.unit=unit;
    }

}