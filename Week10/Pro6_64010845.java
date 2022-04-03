package Week10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Pro6_64010845 extends Application {
    public void start(Stage priamrysStage) {
        SecondFanPane secondFanPane = new SecondFanPane();

        Button btnPause = new Button("Pause");
        Button btnResume = new Button("Resume");
        Button btnReverse = new Button("Reverse");
        HBox btnBox = new HBox(5);
        btnBox.setAlignment(Pos.CENTER);
        btnBox.getChildren().addAll(btnPause, btnResume, btnReverse);

        Slider slider = new Slider();
        slider.setMax(5);
        secondFanPane.rateProperty().bind(slider.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setTop(btnBox);
        pane.setCenter(secondFanPane);
        pane.setBottom(slider);

        btnPause.setOnAction(e -> {
            secondFanPane.pause();
        });
        btnResume.setOnAction(e -> {
            secondFanPane.play();
        });
        btnReverse.setOnAction(e -> {
            secondFanPane.reverse();
        });

        Scene scene = new Scene(pane, 200, 200);
        priamrysStage.setTitle("หน่อยเหยดแม่");
        priamrysStage.setScene(scene);
        priamrysStage.show();

        secondFanPane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
