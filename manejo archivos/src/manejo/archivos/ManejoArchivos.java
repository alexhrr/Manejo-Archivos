/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author PROFESIONAL
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter escribir;
        File file = new File("archivo.txt");
        int puntaje = 0;
        int cantidad = 0;
        cantidad = (int) (Math.random() * 10) + 0;
        String puntajes[] = new String[cantidad];
        int contador = 0;
        String informacion = " ";
        if (!file.exists()) {
            try {
                file.createNewFile();
                escribir = new FileWriter(file, true);
                PrintWriter imprimir = new PrintWriter(escribir);
                do {
                    puntaje = (int) (Math.random() * 1000) + 0;
                    String cadena = Integer.toString((int) puntaje);
                    puntajes[contador] = cadena;
                    System.out.println("puntaje: " + puntajes[contador]);
                    informacion = informacion + ("puntaje: " + puntajes[contador]);
                    cantidad--;
                    contador++;
                } while (cantidad > 0);
                imprimir.println(informacion);
                imprimir.close();
                escribir.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            };
        } else {
            try {
                escribir = new FileWriter(file, true);
                PrintWriter imprimir = new PrintWriter(escribir);
                do {
                    puntaje = (int) (Math.random() * 1000) + 0;
                    String cadena = Integer.toString((int) puntaje);
                    puntajes[contador] = cadena;
                    System.out.println("puntaje: " + puntajes[contador]);
                    informacion = informacion + ("      puntaje: " + puntajes[contador]);
                    cantidad--;
                    contador++;
                } while (cantidad > 0);
                imprimir.println(informacion);
                imprimir.close();
                escribir.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            };
        }
    }

}
