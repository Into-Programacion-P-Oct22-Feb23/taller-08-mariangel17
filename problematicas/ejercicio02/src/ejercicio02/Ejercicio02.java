/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String cadenaAcum2= "N°      |       x2      |       x3      |       x4";
        for (int i = 25; i >0; i--) {
            int valor2=i;
            int valorX2=valor2*2;
            int valorX3=valor2*3;
            int valorX4=valor2*4;
            cadenaAcum2=cadenaAcum2+"\n"+valor2+"       |       "+valorX2+"       |       "+valorX3+"       |       "+valorX4;
        }
        System.out.println(cadenaAcum2);
    }
    
}
