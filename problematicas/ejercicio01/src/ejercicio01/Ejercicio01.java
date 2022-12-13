/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada = new Scanner(System.in);
      double promedioedad = 0;
      double promedioestatura = 0;
      double estatura;
      int edad;
       System.out.print("Ingrese el numero de jugadores:");
       int jugadores = entrada.nextInt();
       String cadenaAcum="Listado de jugadores\n\n";
       for(int i = 1; i <= jugadores; i++){
            System.out.println("Ingrese el nombre del jugador " + i + ":");
            String nombre = entrada.next();
            System.out.println("Ingrese la posicion del jugador " + i + ":");

            entrada.nextLine();
            String posicion = entrada.next();
            System.out.println("Ingrese la edad del jugador " + i + ":");
             edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador " + i + ":");
            estatura = entrada.nextDouble();
            promedioedad= promedioedad + edad;
            promedioestatura= promedioestatura + estatura;
            
            cadenaAcum= cadenaAcum + i + ". " + nombre + " -" + posicion + "-,"
                    + ""+" edad " + edad + ", estatura " + estatura+"\n"+
                    "Promedio de edades:" 
                    + promedioedad +"\n"+"Promedio de estaturas:" + 
                    promedioestatura;
            

       }
          System.out.println(cadenaAcum);



            
            
            
        }
    }
    

