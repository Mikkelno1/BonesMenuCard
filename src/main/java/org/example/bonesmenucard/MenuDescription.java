package org.example.bonesmenucard;

import javafx.scene.control.Label;

public class MenuDescription extends Label
{

    public MenuDescription(String h, String b)
    {
        Label hLabel = new Label();
        Label bLabel = new Label();

        hLabel.getStyleClass().add("menu-itemHeader");
        bLabel.getStyleClass().add("menu-itemDescription");

        getChildren().addAll(hLabel,bLabel);
        getStyleClass().add("menu-itemContainer");
    }
}
