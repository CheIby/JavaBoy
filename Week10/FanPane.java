package Week10;

import javafx.collections.ObservableList;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

public class FanPane extends StackPane {
    private double beginAngle = 15;
    private Timeline animation;
    private Pane blades = getBlades();
    private ObservableList<Node> list = blades.getChildren();

    public FanPane() {
        getChildren().addAll(getCircle(), blades);
        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> spinFan()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        return circle;
    }

    private Pane getBlades() {
        Pane pane = new Pane();
        double angle = 0;
        for (int i = 0; i < 4; i++) {
            Arc arc = new Arc(125, 115, 90, 90, angle + 90, 50);
            arc.setFill(Color.BLACK);
            arc.setType(ArcType.ROUND);
            pane.getChildren().add(arc);
            angle += 90;
        }
        return pane;
    }

    protected void spinFan() {
        for (int i = 0; i < list.size(); i++) {
            Arc a = (Arc) list.get(i);
            a.setStartAngle(a.getStartAngle() + beginAngle);
        }
    }

    protected void reverse() {
        beginAngle *= -1;
    }

    public void pause() {
        animation.pause();
    }

    public void play() {
        animation.play();
    }
}
