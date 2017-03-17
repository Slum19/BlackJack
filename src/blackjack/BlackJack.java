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
    //here...
    public void start(Stage primaryStage) {
            //creates a button that gives a player a random card
        Button hit = new Button();
        hit.setText("Hit Me");
        hit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent hitMe) {
               //gives player a random card
            }
        });
            //creates a button that ends player turn
        Button hold = new Button();
        hold.setText("Hold");
        hold.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent hold) {
               //generates computer's hand and then compares them
               //to determine the winner
            }
        });
        
        StackPane root = new StackPane();
    hit.setLayoutX(250);
    hit.setLayoutY(250);
    root.getChildren().add(hit);
    hold.setLayoutX(500);
    hold.setLayoutY(500);
    root.getChildren().add(hold);
    primaryStage.setScene(new Scene(root, 1024, 768));
    primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
