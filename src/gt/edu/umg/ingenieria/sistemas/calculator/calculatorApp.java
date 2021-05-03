package gt.edu.umg.ingenieria.sistemas.calculator;

import gt.edu.umg.ingenieria.sistemas.calculator.model.CircleEntity;
import gt.edu.umg.ingenieria.sistemas.calculator.model.FigureEntity;
import gt.edu.umg.ingenieria.sistemas.calculator.model.SquareEntity;
import gt.edu.umg.ingenieria.sistemas.calculator.util.CircleFunctions;
import gt.edu.umg.ingenieria.sistemas.calculator.util.SquareFunctions;
import gt.edu.umg.ingenieria.sistemas.calculator.util.TriangleFunctions;
import java.util.*;

/*
import model.FigureEntity;
import model.SquareEntity;
import util.CircleFunctions;
import util.SquareFunctions;
import util.TriangleFunctions;
import model.CircleEntity;
*/
public abstract class calculatorApp {

    
    public calculatorApp() {
    }

    
    public static void main(String[] args) {
      FigureEntity fig = new CircleEntity();
      
      fig.setBackgroundColor("rojo");
      fig.setBorderColor("blue");
      fig.setUnit("cm");
      fig.setPositionX(23.23);
      fig.setPositionY(5.5);
      
      CircleFunctions cir = new CircleFunctions();
      cir.printFigure(fig);
      cir.drawFigure(fig);
      cir.exportCoordinates(fig);
      cir.exportFigure(fig);
      
    }

}