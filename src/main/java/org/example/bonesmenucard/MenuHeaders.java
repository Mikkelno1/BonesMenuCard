package org.example.bonesmenucard;

import javafx.scene.control.Label;

public class MenuHeaders extends Label
{

    public MenuHeaders(String s)
    {
        super(s);
        getStyleClass().add("menu-header");
    }
}
