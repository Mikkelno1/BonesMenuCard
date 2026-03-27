package org.example.bonesmenucard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application
{

    private int xWidth = 500;
    private int yHeight = 800;

    @Override
    public void start(Stage stage) throws IOException
    {

        MenuCardUI mCUI = new MenuCardUI();
        Parent root = mCUI.getView();
        Scene scene = new Scene(root, xWidth, yHeight);
        scene.setUserAgentStylesheet(getClass().getResource("/CSS/Theme1.css").toExternalForm());
        stage.setTitle("Bones menu");
        stage.setScene(scene);
        stage.show();

    }
}
