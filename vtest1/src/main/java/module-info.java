module au.edu.cqu.venu.uma.vtest1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens au.edu.cqu.venu.uma.vtest1 to javafx.fxml;
    exports au.edu.cqu.venu.uma.vtest1;
}
