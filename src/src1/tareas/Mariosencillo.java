package src1.tareas;

import libs.Input;

public class Mariosencillo {
    
    // primero ingresar la altura de la piramide
    //dibujar la piramide

    public static void main(String args[]) {
        // prompt user for x
        System.out.print("Ingresar la altura de la piramide: ");
        int alturaPiramides = Input.get_int();
        
        dibujarPiramide(alturaPiramides);

    }

    private static void dibujarPiramide(int alturaPiramides) {
        
        for(int i=0;i<alturaPiramides;i++){
            
            dibujarRenglon(alturaPiramides, i);
            
        }
        
    }

    private static void dibujarRenglon(int altura, int renglon) {
        dibujarEspacios(altura, renglon);
        dibujarAsteriscos(altura, renglon);
        System.out.println();
    }

    private static void dibujarAsteriscos(int altura, int renglon) {
        int numAsteriscos = 2 + renglon;
        int totalCaracteres = altura + 1;
        int numEspacios = totalCaracteres - numAsteriscos;
        for(int i = 0; i < numAsteriscos;i++) {
            System.out.print("*");
        }
    }

    private static void dibujarEspacios(int altura, int renglon) {
        int numAsteriscos = 2 + renglon;
        int totalCaracteres = altura + 1;
        int numEspacios = totalCaracteres - numAsteriscos;
        for(int i = 0; i < numEspacios;i++) {
            System.out.print(" ");
        }
    }
}
