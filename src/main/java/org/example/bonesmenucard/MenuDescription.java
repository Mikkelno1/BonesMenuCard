package org.example.bonesmenucard;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MenuDescription extends VBox
{

    public MenuDescription(String h, String b)
    {
        Label hLabel = new Label(h);
        Label bLabel = new Label(b);

        hLabel.getStyleClass().add("menu-itemHeader");
        bLabel.getStyleClass().add("menu-itemDescription");

        getChildren().addAll(hLabel,bLabel);
        getStyleClass().add("menu-itemContainer");
    }
}
