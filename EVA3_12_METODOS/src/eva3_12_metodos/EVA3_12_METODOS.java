/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_12_metodos;

/**
 *
 * @author invitado
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Invocar al método --> Llamada --> Call
        mostrarMensaje("Hola mundo cutre!!"); 
        MostrarMuchosMensajes("Hola xd!!", 10);
    }
    //public static --> para la materia de POO
    //Void --> (Tipo de dato) valor que regresa el metodo
    //Void --> no regresa nada
    // nombre del metodo --> Identificador válido
    //Empezar en minúscular, deber ser un verbo
    //() <--- Parámetros del metodo (Argumentos) --> Valores que necesite  
    //Para funcionar.
    public static void mostrarMensaje (String mensaje) { //Encabezado (Nombre del metodo)
        //Cuerpo del metodo: aqui va nuestro codigo 
        System.out.println(mensaje);
    }
    
    public static void MostrarMuchosMensajes(String mensaje, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
            
        }
        
    }
}

