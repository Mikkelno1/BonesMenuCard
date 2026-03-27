package CustomComps;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
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
        RadioButton rb = new RadioButton();

        hLabel.getStyleClass().add("menu-itemHeader");
        pLabel.getStyleClass().add("menu-itemPrice");
        dLabel.getStyleClass().add("menu-itemDescription");
        spacer.getStyleClass().add("menu-itemSpacer");
        rb.getStyleClass().add("radio-button");


        //rb.setStyle("-fx-border-color: #ff1111; -fx-background-radius: 2");
        HBox.setHgrow(spacer, Priority.ALWAYS);
        HBox side = new HBox(rb,pLabel);
        side.setAlignment(Pos.CENTER_RIGHT);
        side.setSpacing(5);
        HBox top = new HBox(hLabel,spacer,side);          //laver en hbox til at holde alle top værdier
        top.setAlignment(Pos.CENTER_LEFT);
        top.setMaxWidth(Double.MAX_VALUE);

        this.setMaxWidth(Double.MAX_VALUE);

        getChildren().addAll(top,dLabel); // for vbox, så toppen af vbox er en hbox og bunden er description.
        getStyleClass().add("menu-itemContainer");
    }


}
