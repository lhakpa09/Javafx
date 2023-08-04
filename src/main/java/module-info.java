module project_slr.project_l {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens project_slr.project_l to javafx.fxml;
    exports project_slr.project_l;
}