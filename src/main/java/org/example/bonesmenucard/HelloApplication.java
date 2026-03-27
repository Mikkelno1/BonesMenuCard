package org.example.bonesmenucard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import com.sun.javafx.css.StyleManager;

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
        //Application.setUserAgentStylesheet(getClass().getResource("Theme1.css").toExternalForm());
        StyleManager.getInstance().addUserAgentStylesheet("C:\\Users\\Mikkel  Norinder\\Exercism\\java\\AnonymousInnerClass\\BonesMenuCard\\src\\main\\resources\\CSS\\Theme1.css");
        stage.setTitle("Bones menu");
        stage.setScene(scene);
        stage.show();

    }
}
