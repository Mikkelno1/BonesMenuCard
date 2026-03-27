package org.example.bonesmenucard;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;

 enum MenuOption
{
    STANDARD, TWOOPTIONS, THREEOPTIONS, SPECIAL, RARITY
}

public class MenuItem extends Label
{

     private MenuOption mO ;


public void setType(MenuOption mO)
{
    this.mO = mO;
}

private String s;

MenuHeaders mHeaders = new MenuHeaders(s);

    protected void addListener()
    {
        this.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                setStyle(null);

                switch(mO)
                {
                    case STANDARD:
                        mHeaders.setText();
                        break;
                    case TWOOPTIONS:
                        mHeaders.setText();
                        break;
                    case THREEOPTIONS:
                        mHeaders.setText();
                        break;
                    case SPECIAL:
                        mHeaders.setText();
                        break;
                    case RARITY:
                        mHeaders.setText();
                        break;
                }
            }
        });
    }

}
