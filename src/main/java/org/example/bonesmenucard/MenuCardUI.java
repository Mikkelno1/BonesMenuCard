package org.example.bonesmenucard;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuCardUI
{
    ScrollPane root;

    RadioButton rb1 = new RadioButton();

    private int xWidth = 500;
    private int yHeight = 1200;


    public void uiLayOut()
    {
        root = new ScrollPane();
        root.setLayoutX(xWidth);
        root.setLayoutY(yHeight);


    }

    public ScrollPane getView()
    {
        return root;
    }
}
