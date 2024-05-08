/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_arreglos;

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
public class EVA3_9_ARREGLOS extends Application {
    
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
        String diasSemana [] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado","Domingo"};
        char vocales [] = {'a', 'e', 'i', 'o','u'};
        
        System.out.println("Tamaño del arreglo diasSemana =" + diasSemana.length);
        System.out.println ("Tamaño del arreglo diasSemana = " + vocales.length);
        
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
        }
            for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
            }
            System.out.println("");
             String menu [] = {"Archivo", "Nueva Factura", "Modificar", "Salir"};
            for (int i = 0; i < menu.length; i++) {
    System.out.println (i + " - " + menu [i]); 
            
        
        
           
       
}   
}   
} 

