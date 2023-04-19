
package parada_autobus;

public class Solucion {
    
    public void ParadaAutoBus(double M[][], int filas, int columas) {
        
        double tiempo = 0.00;
        int numero_clientes = 0;
        double siguiente_cliente = 0;
        double siguiente_autobus = 0;
        // para los eventos
        final int cliente = 1;
        final int autobus = 2;
        
        while (tiempo <= filas) { 
            
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columas; j++) {
                    
                    if (j == 0) { // columna del tiempo
                        if (siguiente_cliente > siguiente_autobus) {
                            tiempo = siguiente_autobus;
                            M[i][j] = tiempo;
                        } else {
                            tiempo = siguiente_cliente;
                            M[i][j] = tiempo;
                        }
                    }
                    if (j == 1) { // columna del evento
                        if (siguiente_cliente > siguiente_autobus) {
                            M[i][j] = autobus;
                        } else {
                            M[i][j] = cliente;
                        }
                    }
                    if (j == 2) { // columna de numero de clientes
                        if (M[i][1] == 2) {
                            numero_clientes = 0;
                            M[i][j] = numero_clientes++;
                        } else {
                            M[i][j] = numero_clientes++;
                        }
                    }
                    if (j == 3) { // columna de siguiente cliente
                        if (M[i][1] == 2) {
                            M[i][j] = siguiente_cliente;
                        } else {
                            siguiente_cliente = tiempo + (-((Math.log(1 - Math.random()))/0.5));
                            M[i][j] = siguiente_cliente;
                        }
                    }
                    if (j == 4) { // columnas de siguiente autobus
                        if (M[i][1] == 2) {
                            
                        } else {
                            siguiente_autobus = siguiente_autobus;
                            M[i][j] = siguiente_autobus;
                        }
                    }
                }
            }
        }
    }
    
    public void MostrarResultado(double M[][], int filas, int columnas) {
        
    }
    
}
