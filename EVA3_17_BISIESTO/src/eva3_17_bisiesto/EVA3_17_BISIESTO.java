/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author troyx
 */
public class EVA3_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el año");
        int año = captu.nextInt();
        if (Bisiesto(año))
            System.out.println("Es un año Bisiesto");
        else
            System.out.println("No es un año bisiesto");
        captu.close();
         }
        public static boolean Bisiesto(int año){
            if (año % 100!= 0){
            if (año % 4 == 0)
                return true;
             else
                return false;
             } else if (año % 400 == 0)
                 return true;
            else
                 return false;
            
        
        }       
}
