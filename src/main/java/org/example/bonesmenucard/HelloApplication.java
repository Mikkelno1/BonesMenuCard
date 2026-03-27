package org.example.bonesmenucard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

import static org.example.bonesmenucard.MenuOption.*;

public class HelloApplication extends Application
{

    private int xWidth = 500;
    private int yHeight = 1200;

    @Override
    public void start(Stage stage) throws IOException
    {



        MenuItem mI = new MenuItem();
        mI.setType(STANDARD);
        mI.setType(TWOOPTIONS);
        mI.setType(THREEOPTIONS);
        mI.setType(SPECIAL);
        mI.setType(RARITY);

        MenuCardUI mCUI = new MenuCardUI();
        Parent root = mCUI.getView();
        Scene scene = new Scene(root, xWidth, yHeight);
        stage.setTitle("Next Generation Booking System!");
        stage.setScene(scene);
        stage.show();

    }
}
