/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author troyx
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int arreglo[] = new int[10];
      
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        }
 
        for (int val : arreglo) {
            System.out.println("[" + val + "]");
        }
       
        Scanner captu = new Scanner(System.in);
        System.out.print("¿Qué valor quieres buscar? ");
        int valor = captu.nextInt();
        // BUSCAR
      
        for (int i = 0; i < arreglo.length; i++) {
            if (valor == arreglo[i]) {
                pos = i; 
                break;
            }
        }
        if (pos != -1) {
            System.out.println("El valor " + valor + " se encuentra en la posición " + pos + ".");
        } else {
            System.out.println("El valor " + valor + " no se encuentra en el arreglo.");
        }
        captu.close();
    
}
}