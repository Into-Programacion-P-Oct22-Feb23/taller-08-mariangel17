/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Usuario PC
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int temperaturaF = 20;
        String conversionesAcum = "°F       |       °C";

        for(int i=1; i<=20; i++){
        double temperaturaC =(temperaturaF - 32) * 5/9;
        conversionesAcum = conversionesAcum +"\n"+ temperaturaF + "       |       " + temperaturaC;
        temperaturaF = temperaturaF + 4;

}
System.out.println(conversionesAcum);
        
    }
    
}
