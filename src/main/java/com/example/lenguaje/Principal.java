package com.example.lenguaje;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Principal extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Principal.class.getResource("lenguaje.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1052, 701);
        stage.getIcons().add(new Image("C:/Users/eugen/IdeaProjects/Lenguaje/src/main/resources/imagenes/Corona.png"));
        stage.setTitle("Lenguaje de Programación");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}