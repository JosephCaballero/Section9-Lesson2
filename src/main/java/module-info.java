module com.example.section9lesson2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.section9lesson2 to javafx.fxml;
    exports com.example.section9lesson2;
}