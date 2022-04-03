package Week10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Pro1_64010845 extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();

        pane.add(new ImageView(new Image("C:/Users/Admin/Java/Lab/Week10/img/uk.gif")), 0, 0);
        pane.add(new ImageView(new Image("C:/Users/Admin/Java/Lab/Week10/img/ca.gif")), 1, 0);
        pane.add(new ImageView(new Image("C:/Users/Admin/Java/Lab/Week10/img/china.gif")), 0, 1);
        pane.add(new ImageView(new Image("C:/Users/Admin/Java/Lab/Week10/img/us.gif")), 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Flag");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
