package project_slr.project_l.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

    public class VBoxDemo extends Application {
        public static void main(String[] args) {

            launch();
        }

        @Override
        public void start(Stage stage) throws Exception {
            VBox vBox = new VBox();
            for (int i = 0; i < 20; i++) {
                Button button = new Button("hello"+i);
                vBox.getChildren().add(button);
            }
//        tilePane.setOrientation(Orientation.VERTICAL);
            Scene scene = new Scene(vBox, 600, 480);
            stage.setScene(scene);
            stage.show();
        }
    }
