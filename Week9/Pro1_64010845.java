package Week9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class Pro1_64010845 extends Application {
    private TextField loanAmount = new TextField();
    private TextField numberOfYear = new TextField();
    private TextArea textArea = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        loanAmount.setPrefColumnCount(7);
        numberOfYear.setPrefColumnCount(2);

        Button btnShowTable = new Button();
        btnShowTable.setText("Show Talble");

        HBox hearder = new HBox(20);
        hearder.setAlignment(Pos.CENTER);
        hearder.getChildren().addAll(new Label("Loan Amount"), loanAmount, new Label("Number of Years"),
                numberOfYear, btnShowTable);

        VBox bottom = new VBox(20);
        bottom.setAlignment(Pos.BOTTOM_CENTER);
        bottom.getChildren().add(new Label("64010845 Sirasit Thiancharoenchai"));

        BorderPane pane = new BorderPane();
        pane.setTop(hearder);
        pane.setCenter(textArea);
        pane.setBottom(bottom);

        btnShowTable.setOnAction(e -> {
            String render = "";
            double monthlyInterestRate;
            double monthlyPayment;
            if (Double.parseDouble(loanAmount.getText()) < 0.0 || Double.parseDouble(numberOfYear.getText()) < 0.0) {
                textArea.setText("Error");
            } else {
                render += "Interest Rate         Monthly Payment          Total Payment\n";
                for (Double i = 5.0; i <= 8; i += 0.25) {
                    monthlyInterestRate = i / 1200;
                    monthlyPayment = Double.parseDouble(loanAmount.getText()) * monthlyInterestRate /
                            (1 - 1 / Math.pow(1 + monthlyInterestRate,
                                    Double.parseDouble(numberOfYear.getText()) * 12));

                    render += String.format("%.2f%30.2f%34.2f\n", i, monthlyPayment,
                            (monthlyPayment * 12) * Double.parseDouble(numberOfYear.getText()));
                }
                textArea.setText(render);
            }
        });

        Scene scene = new Scene(pane);
        primaryStage.getIcons().add(new Image("C:/Users/Admin/Java/Lab/Week9/pc.png"));
        primaryStage.setTitle("Loan GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}