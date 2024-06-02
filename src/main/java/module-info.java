module com.practice.javanewfeatures {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practice.javanewfeatures to javafx.fxml;
    exports com.practice.javanewfeatures;
}