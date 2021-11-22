module ict.kosovo.growth.notepad {
    requires javafx.controls;
    requires javafx.fxml;


    opens ict.kosovo.growth.notepad to javafx.fxml;
    exports ict.kosovo.growth.notepad;
}