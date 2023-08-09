package project_slr.project_l.layoutmanagers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {
    public static void main(String[] args) {

        launch();
    }
private Button createButton(String buttonLabel) {
        Button button = new Button(buttonLabel);
    button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    button.setMinSize(100, 200);
    button.setAlignment(Pos.CENTER);
    BorderPane.setMargin(button, new Insets(4));
    return button;
}
    @Override
    public void start(Stage stage) throws Exception {
        Button leftButton = createButton("Left Button");
        Button rightButton = createButton("Right Button");
        Button centerButton = createButton("Center Button");
        Button topButton = createButton("Top Button");
        Button buttonButton = createButton("Button Button");


        BorderPane borderPane= new BorderPane();
        borderPane.setPadding(new Insets(10));
        borderPane.setTop(topButton);
        borderPane.setRight(rightButton);
        borderPane.setLeft(leftButton);
        borderPane.setCenter(centerButton);
        borderPane.setBottom(buttonButton);

        Scene scene = new Scene(borderPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
}
