package project_slr.project_l;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler <ActionEvent> {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        BorderPane borderPane = new BorderPane();
        Button button = new Button("Click Me");
        Button button2 = new Button("Click Me");
        borderPane.setCenter(button);
        borderPane.setBottom(button2);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello!!!!!");
            }
        });
        button2.setOnAction(this);
        Scene scene = new Scene(borderPane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("hait kada");


    }
}