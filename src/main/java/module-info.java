module com.example.lenguaje {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;
    requires antlr;
    requires richtextfx.fat;

    opens com.example.lenguaje to javafx.fxml;
    exports com.example.lenguaje;
}