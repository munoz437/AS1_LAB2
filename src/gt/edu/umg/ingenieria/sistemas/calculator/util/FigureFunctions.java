package gt.edu.umg.ingenieria.sistemas.calculator.util;

import gt.edu.umg.ingenieria.sistemas.calculator.model.FigureEntity;
import java.util.*;


public abstract class FigureFunctions {

    public FigureFunctions() {
    }

    
    public void printFigure(FigureEntity figure) {
        System.out.println("Imprimiendo Figura");
        System.out.println("Color de Fondo: "+figure.getBackgroundColor());
        System.out.println("Color de Borde: "+figure.getBorderColor());
        System.out.println("Unidades: "+figure.getUnit());
        System.out.println("Posicion X: "+figure.getPositionX());
        System.out.println("Posicion Y: "+figure.getPositionY());
    }

   
    public void drawFigure(FigureEntity figure) {
       System.out.println("Dibujando Figura");
        System.out.println("Color de Fondo: "+figure.getBackgroundColor());
        System.out.println("Color de Borde: "+figure.getBorderColor());
        System.out.println("Unidades: "+figure.getUnit());
        System.out.println("Posicion X: "+figure.getPositionX());
        System.out.println("Posicion Y: "+figure.getPositionY());
    }

   
    public void exportFigure(FigureEntity figure) {
       System.out.println("Exportando Figura");
        System.out.println("Color de Fondo: "+figure.getBackgroundColor());
        System.out.println("Color de Borde: "+figure.getBorderColor());
        System.out.println("Unidades: "+figure.getUnit());
        System.out.println("Posicion X: "+figure.getPositionX());
        System.out.println("Posicion Y: "+figure.getPositionY());
    }

    public void exportCoordinates(FigureEntity figure) {
        System.out.println("Exportando Coordenadas");
        System.out.println("Posicion X: "+figure.getPositionX());
        System.out.println("Posicion Y: "+figure.getPositionY());
    }

}