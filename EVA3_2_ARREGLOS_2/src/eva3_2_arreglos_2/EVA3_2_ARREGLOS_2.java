/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arreglos_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author invitado
 */
public class EVA3_2_ARREGLOS_2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        //JAVA: 0 primer elemento 
        // N - 1 ultimo elemento
        //N --> TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO 
        
        // Vamos a crear un arreglo y llenarlo de valores aleatorios
        // int datos [], x, y; --> SOLO datos ES UN ARREGLO 
        // int [] datos, x, y; --> TODAS LAS VARIABLES REPRESENTAN UN ARREGLO 
        int datos [] = new int [10];
        
        //valores aleatorios entre 0 y 99
        for (int i = 0; i < datos.length; i++){
            datos[i] = (int) (Math.random() * 100); //Numeros entre 0 y 99
        }
        //Imprimir los elementos del arreglo
         for(int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos [i] + "]");
        }
             
         
    }
}
    



