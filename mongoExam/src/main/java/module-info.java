module com.example.mongoexam {
    requires javafx.controls;
    requires javafx.fxml;
    requires mongo.java.driver;



    opens com.example.mongoexam to javafx.fxml;
    exports com.example.mongoexam;
}