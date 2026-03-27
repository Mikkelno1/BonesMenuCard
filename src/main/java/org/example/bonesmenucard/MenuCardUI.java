package org.example.bonesmenucard;

import CustomComps.MenuDescription;
import CustomComps.MenuHeader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class MenuCardUI
{
    VBox root;

    MenuHeader mh = new MenuHeader("Steak");
    MenuDescription md = new MenuDescription("The original american spareribs", "Baby Back Ribs with Sam Bone’s original BBQ", "169Kr.");

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
        root = new VBox();

        mh.setLayoutX(mhX);
        mh.setLayoutY(mhY);
        md.setLayoutX(mdX);
        md.setLayoutY(mdY);
        label.setLayoutX(mdX);
        label.setLayoutY(mdY);

        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #f5f5ee;");
        root.getChildren().addAll(md, mh);

    }

    public Pane getView()
    {
        return root;
    }
}
