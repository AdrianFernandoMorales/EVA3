/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_14_return_2;

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
public class EVA3_14_RETURN_2 extends Application {
    
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
         Scanner captu = new Scanner(System.in);
        System.out.println("Base:");
        int base = captu.nextInt();
        System.out.println("Pot:");
        int Pot = captu.nextInt();
        //Calcular la potencia:
        int resu = calcularPot(base,Pot);
        System.out.println("El resultado es = " + resu);
    }
    //Crear una función que calcule la potencia de un valor entero
    public static int calcularPot(int base, int potencia){
        //Muy similar a las sumatorias 
        //Necesitamos un acumulador 
        //Suma = Suma + valor;
        //Suma += valor;
        int resu = 1;
        for (int i = 0; i < potencia; i++) {
            resu = resu * base;
        }
         return resu;   
        }
    }
    

