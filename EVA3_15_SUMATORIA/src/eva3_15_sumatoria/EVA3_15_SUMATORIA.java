/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author troyx
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println ("Primer Numero: ");
        int Numero = captu.nextInt();
        
        int Suma = CalcularSuma (Numero);
        System.out.println("El resultado es:"  + Suma );
    }
    public static int CalcularSuma (int Numero){
        int Suma = 0;
        for (int i = 0; i <= Numero; i++) {
            Suma = Suma + i;
            
        }
        return Suma;
    }
    
}
