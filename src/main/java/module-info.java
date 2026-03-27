module org.example.bonesmenucard {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.bonesmenucard to javafx.fxml;
    exports org.example.bonesmenucard;
}