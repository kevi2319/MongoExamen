package com.example.mongoexam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    Parent root;
    root= FXMLLoader.load(Main.class.getResource("registroJugador.fxml"));
    Scene scene=new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculadora");
        primaryStage.show();
}
