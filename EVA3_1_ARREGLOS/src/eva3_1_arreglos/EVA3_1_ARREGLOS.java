/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_arreglos;

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
public class EVA3_1_ARREGLOS extends Application {
   
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
      //[] Sirven para manejar los indices: Arreglo [3] acceso a la posicion 
      //Declaracion = creacion (new) [Tamaño del arreglo]
      int Arreglo[] = new int [10]; //Un arreglo de 10 enteros
      //A traves de indices: 
      //Debemos conocer las posiciones de los valores 
      //PRIMER POSICION DE N ARREGLO ES --> 0
      //LA ULTIMA POSICION DE UN ARREGLO ES -->N - 1
      //N ES EL TAMAÑO DEL ARREGLO
      Arreglo[1] = 100;
      System.out.println("Valor de arreglo [1] = " + Arreglo[1]);
       System.out.println(Arreglo);
        System.out.println(Arreglo.length); //LENGTH es ña cantidad de elementos 
   }
   
}
