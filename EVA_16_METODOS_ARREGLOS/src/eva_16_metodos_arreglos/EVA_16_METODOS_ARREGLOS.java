/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_16_metodos_arreglos;

/**
 *
 * @author troyx
 */
public class EVA_16_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]datos = new int[10];
                datos = Llenar(datos);
                Imprimir(datos);
                System.out.println("");
                
                int[]datos2 = new int[10];
                datos = Llenar(datos2);
                Imprimir(datos2);
    }
    public static void Imprimir(int[] arreglo){
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println("[" + arreglo [i] + "]");
            
        }
        System.out.println("");
    }
    
    public static int [] Llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()* 100);
             }
        return arreglo;     
        }
        }