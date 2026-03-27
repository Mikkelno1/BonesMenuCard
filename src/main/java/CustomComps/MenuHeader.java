package CustomComps;

import javafx.scene.control.Label;

public class MenuHeader extends Label
{
    public MenuHeader(String s)
    {
        super(s);
        getStyleClass().add("menu-header");
    }
}
