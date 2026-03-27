package CustomComps;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class UberHeader extends HBox {

    public UberHeader(String header, String number)
    {
        Label hLabel = new Label(header);
        Label nLabel = new Label(number);
        Region spacer = new Region();
        Region spacer2 = new Region();


        spacer.getStyleClass().add("uber-spacer");
        spacer2.getStyleClass().add("uber-spacer");
        getStyleClass().add("uber-header");

        HBox.setHgrow(spacer, Priority.ALWAYS);
        HBox.setHgrow(spacer2, Priority.ALWAYS);
        nLabel.setAlignment(Pos.CENTER_RIGHT);
        hLabel.setAlignment(Pos.CENTER);

        getChildren().addAll(nLabel,spacer,hLabel,spacer2);
    }
}
