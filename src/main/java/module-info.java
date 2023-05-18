module com.example.wavefunctionexperiment {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.wavefunctionexperiment to javafx.fxml;
    exports com.example.wavefunctionexperiment;
}