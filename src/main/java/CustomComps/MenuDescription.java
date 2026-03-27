package CustomComps;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class MenuDescription extends VBox
{

    public MenuDescription(String header, String description, String price)
    {
        Label hLabel = new Label(header);
        Label dLabel = new Label(description);
        Label pLabel = new Label(price);
        Region spacer = new Region();   //Bruger en Region istedet for en separator, så jeg kan få dots nede på linjen

        hLabel.getStyleClass().add("menu-itemHeader");
        pLabel.getStyleClass().add("menu-itemPrice");
        dLabel.getStyleClass().add("menu-itemDescription");
        spacer.getStyleClass().add("menu-itemSpacer");

        HBox.setHgrow(spacer, Priority.ALWAYS);
        HBox top = new HBox(hLabel,spacer,pLabel);          //laver en hbox til at holde alle top værdier
        top.setAlignment(Pos.CENTER_LEFT);


        getChildren().addAll(top,dLabel); // for vbox, så toppen af vbox er en hbox og bunden er description.
        getStyleClass().add("menu-itemContainer");
    }
}
