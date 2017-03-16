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
            //creates a button that gives a player a random card
        Button hold = new Button();
        hold.setText("Hold");
        hold.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent hold) {
               //generates computer's hand and then compares them
               //to determine the winner
            }
        });
        
        StackPane hitButton = new StackPane();
        StackPane holdButton = new StackPane();
        hitButton.getChildren().add(hit);
        holdButton.getChildren().add(hold);
        
        Scene scene1 = new Scene(hitButton, 200, 250);
        Scene scene2 = new Scene(holdButton, 400, 250);
        
        primaryStage.setTitle("Player Choice1");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
