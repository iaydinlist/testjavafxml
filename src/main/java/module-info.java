module aydin.javafxfxmlproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens aydin.javafxfxmlproject to javafx.fxml;
    exports aydin.javafxfxmlproject;
}
