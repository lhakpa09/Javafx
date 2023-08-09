package project_slr.project_l.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class HBoxDemo extends Application{
        public static void main(String[] args) {

            launch();
        }

        @Override
        public void start(Stage stage) throws Exception {
            HBox hBox = new HBox();
            for (int i = 0; i < 20; i++) {
                Button button = new Button("hello"+i);
                hBox.getChildren().add(button);
            }
//        tilePane.setOrientation(Orientation.VERTICAL);
            Scene scene = new Scene(hBox, 600, 480);
            stage.setScene(scene);
            stage.show();
        }
    }
