module pe.upeu.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens pe.upeu.calculatorfx to javafx.fxml;
    exports pe.upeu.calculatorfx;
}