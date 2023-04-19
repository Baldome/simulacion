
package parada_autobus;

import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
//        Solucion solucion = new Solucion();
//        Scanner entrada = new Scanner(System.in);
//        int columnas = 5;
//        System.out.println("----------------------SIMULACION PARADA DE AUTOBUS----------------------");
//        System.out.print("Ingrese la condicion del tiempo del sistema: ");
//        int filas = entrada.nextInt();
//        double M[][] = new double[filas][columnas];
//        solucion.ParadaAutoBus(M, filas, columnas);
//        solucion.MostrarResultado(M, filas, columnas);
        double num_aleatorio = Math.random();
        System.out.print("Numero aleatorio: "+num_aleatorio);
        double T = 0;
        double t = -((Math.log(1 - num_aleatorio))/0.5);
        System.out.println("\nt = "+t);
        T += t;
        System.out.println("T = "+T);
        System.out.println("\n-------------------Autobus-----------------");
        double random = 0.1515; //Math.random();
        double z = ((1/(Math.sqrt(2 * Math.PI)))*Math.exp((-Math.pow(random, 2)/2)));
        System.out.println("Z = "+z);
    }
}
