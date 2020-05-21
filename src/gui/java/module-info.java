module com.thearchermancoding.chemcalc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.thearchermancoding.chemcalc to javafx.fxml;
    exports com.thearchermancoding.chemcalc;
}
