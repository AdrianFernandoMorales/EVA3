/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_captura_datos;

import java.util.Scanner;
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
public class EVA3_4_CAPTURA_DATOS extends Application {
    
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
        int cant;
        Scanner captu = new Scanner (System.in);
        System.out.println("Cuantos nombres vas a capturar");
        cant = captu.nextInt();
        String[] ListaNombres = new String[cant];
        captu.nextLine();
        //Hay que preguntar cada nombre:
        for (int i = 0; i < ListaNombres.length; i++){
        System.out.println("Nombre #" + (i + 1) + ":");
        ListaNombres [i] = captu.nextLine();
        }
        for (int i = 0; i < ListaNombres.length; i++) {
         System.out.println(ListaNombres[i]);   
        }
        
        
    }
    
}
