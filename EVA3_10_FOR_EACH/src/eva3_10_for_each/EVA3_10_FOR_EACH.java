/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_for_each;

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
public class EVA3_10_FOR_EACH extends Application {
    
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
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles","Jueves", "Viernes", "Sabado"};
        for (String dia: diasSemana){
            System.out.println(dia);
        }
        int salario[] = {50, 1232, 23445, 1000, 5000, 777, 2332};
    for(int cant: salario)
    System.out.println("$" + cant);
    
    {
     String Meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Juilo", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
       for (String Mes: Meses){
            System.out.println(Mes);
    
            
       }
    }
    }
}