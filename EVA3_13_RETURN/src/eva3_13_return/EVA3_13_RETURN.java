/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_13_return;

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
public class EVA3_13_RETURN extends Application {
    
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
        System.out.println("Valor 1");
        int val1 = captu.nextInt();
        System.out.println("Valor 2");
        int val2 = captu.nextInt();
        // Llamar a la función 
        //1.- Guardar el resultado: Conveniente si usamos el resultado mas de una vez
        int resu = sumar (val1, val2);
        System.out.println("La suma = " + resu);
        
        //2.- Usar directamente el resultado de la función: Cuando solamente lo vamos a usar una vez
        System.out.println("La suma = " + sumar(val1, val2));
        
        //3.- Ignorar el resultado
        sumar(val1, val2);
    }
    
    public static int sumar(int num1, int num2){
        int resu = num1 + num2;
        return resu; // Es la ultima instrucción del metodo
                     // Despues del return no puede haber más instrucciones
    }
    
}
