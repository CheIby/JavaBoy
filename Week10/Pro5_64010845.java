package Week10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Pro5_64010845 extends Application {
    @Override
    public void start(Stage primaryStage) {
        FanPane pane = new FanPane();

        Button btnPause = new Button("Pause");
        Button btnResume = new Button("Resume");
        Button btnReverse = new Button("Reverse");
        HBox btnBox = new HBox(5);
        btnBox.setAlignment(Pos.CENTER);
        btnBox.getChildren().addAll(btnPause, btnResume, btnReverse);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(btnBox);

        btnPause.setOnAction(e -> {
            pane.pause();
        });
        btnResume.setOnAction(e -> {
            pane.play();
        });
        btnReverse.setOnAction(e -> {
            pane.reverse();
        });

        Scene scene = new Scene(borderPane, 250, 250);
        primaryStage.setTitle("Fan");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
