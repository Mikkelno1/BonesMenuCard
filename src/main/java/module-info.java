module org.example.bonesmenucard {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires jdk.httpserver;
    requires javafx.graphics;


    opens org.example.bonesmenucard to javafx.fxml;
    exports org.example.bonesmenucard;
}