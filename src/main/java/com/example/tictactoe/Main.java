package com.example.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("rockPaperScissors-view.fxml"));
        primaryStage.setTitle("Камень, ножницы, бумага");
        primaryStage.setScene(new Scene(root, 500, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
