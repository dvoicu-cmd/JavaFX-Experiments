import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class q3 extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");
        button = new Button();
        button.setText("click here");

        StackPane layout = new StackPane(); //layout manager


        Scene scene = new Scene(layout, 300, 250);
        layout.getChildren().add(button);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

