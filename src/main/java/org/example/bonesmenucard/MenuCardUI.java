package org.example.bonesmenucard;

import CustomComps.MenuDescription;
import CustomComps.MenuHeader;
import CustomComps.UberHeader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class MenuCardUI
{
    VBox root;

    //UberHeader uh = new UberHeader("");

    MenuHeader mh = new MenuHeader("Steak");
    MenuDescription md = new MenuDescription("The Original American Spareribs",
            "Baby Back Ribs with Sam Bone’s original BBQ", "169Kr.");

    MenuDescription md2 = new MenuDescription("The Original American Spareribs & BBQ Chicken Breast ",
            "With Sam Bone’s original BBQ", "185Kr.");

    UberHeader uh = new UberHeader("CHOOSE MAIN COURSE", "1");

    Label label = new Label("Hello there");


    /*
    private int mhX = 100;
    private int mhY = 100;
    private int mdX = 150;
    private int mdY = 150;
    */

    MenuCardUI()
    {
        uiLayOut();
    }

    public void uiLayOut()
    {
        root = new VBox();

        /*
        mh.setLayoutX(mhX);
        mh.setLayoutY(mhY);
        md.setLayoutX(mdX);
        md.setLayoutY(mdY);
        label.setLayoutX(mdX);
        label.setLayoutY(mdY);
        */

        //rb.setStyle("-fx-border-color: #ff1111; -fx-background-radius: 2");

        root.setPadding(new Insets(20));
        root.setFillWidth(true);
        root.setAlignment(Pos.TOP_CENTER);
        root.setStyle("-fx-background-color: #f5f5ee;");
        root.getChildren().addAll(uh,mh,md,md2);

    }

    public Pane getView()
    {
        return root;
    }
}
