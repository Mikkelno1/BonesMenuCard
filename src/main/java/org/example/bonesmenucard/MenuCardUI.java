package org.example.bonesmenucard;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;


public class MenuCardUI
{
    Pane root;



    MenuHeaders mh = new MenuHeaders("Steak");
    MenuDescription md = new MenuDescription("Reedd steak", "Made red with love");

    Label label = new Label("Hello there");




    private int mhX = 100;
    private int mhY = 100;
    private int mdX = 150;
    private int mdY = 150;


    MenuCardUI()
    {
        uiLayOut();
    }

    public void uiLayOut()
    {
        root = new Pane();

        mh.setLayoutX(mhX);
        mh.setLayoutY(mhY);
        md.setLayoutX(mdX);
        md.setLayoutY(mdY);
        label.setLayoutX(mdX);
        label.setLayoutY(mdY);

        root.getChildren().addAll(md, mh);

    }

    public Pane getView()
    {
        return root;
    }
}
