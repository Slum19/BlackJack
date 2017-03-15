/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 2006729
 */
public class BlackJack extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button hit = new Button();
        hit.setText("Hit Me");
        hit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent hitMe) {
               //gives player a random card
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(hit);
        
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
    }
    
}
