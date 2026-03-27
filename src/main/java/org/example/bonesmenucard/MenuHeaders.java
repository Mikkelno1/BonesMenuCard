package org.example.bonesmenucard;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import com.sun.javafx.css.StyleManager;

public class MenuHeaders extends Label
{

    public MenuHeaders(String s)
    {
        super(s);
    }
    StyleManager.getInstance().addUserAgentStylesheet("Theme1.css");
}
