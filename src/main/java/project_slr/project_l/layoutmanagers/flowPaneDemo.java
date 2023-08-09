package project_slr.project_l.layoutmanagers;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class flowPaneDemo extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();
        for(int i=0; i<20; i++) {
            Button button = new Button("hello");
            flowPane.getChildren().add(button);
        }
        flowPane.setOrientation(Orientation.VERTICAL);
        Scene scene= new Scene(flowPane, 600, 480);
        stage.setScene(scene);
        stage.show();
    }
}
