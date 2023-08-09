package project_slr.project_l.layoutmanagers;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application{
        public static void main(String[] args) {
            launch();
        }

        @Override
        public void start(Stage stage) throws Exception {
            GridPane gridPane = new GridPane();
            Button button = new Button("hello 1");
            Button button1 = new Button("hello 2");
            Button button2 = new Button("hello 3");
            Button button3 = new Button("hello 4");
            Button button4 = new Button("hello 5");


            gridPane.add(button, 0,0,2,2);
            gridPane.add(button1, 2,1,1,1);
            gridPane.add(button2, 2,0,1,1);
            gridPane.add(button3, 3,1,1,1);
            gridPane.add(button4, 3,0,1,1);


            gridPane.setHgap(5);
            gridPane.setVgap(5);

//            gridPane.setOrientation(Orientation.VERTICAL);Orientation
            Scene scene= new Scene(gridPane, 600, 480);
            stage.setScene(scene);
            stage.show();
        }

}
