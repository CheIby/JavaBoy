package Week10;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;
    private boolean hourCheck;
    private boolean minuteCheck;
    private boolean secondCheck;

    private double w = 250;
    private double h = 250;

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.hourCheck = true;
        this.minuteCheck = true;
        this.secondCheck = true;
        showClock();
    }

    public void setHour(int hour) {
        this.hour = hour;
        showClock();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        showClock();
    }

    public void setSecond(int second) {
        this.second = second;
        showClock();
    }

    public void setHourCheck(boolean hourCheck) {
        this.hourCheck = hourCheck;
        showClock();
    }

    public void setMinuteCheck(boolean minuteCheck) {
        this.minuteCheck = minuteCheck;
        showClock();
    }

    public void setSecondCheck(boolean secondCheck) {
        this.secondCheck = secondCheck;
        showClock();
    }

    public void setW(double W) {
        this.w = W;
        showClock();
    }

    public void setH(double h) {
        this.h = h;
        showClock();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public boolean isHourCheck() {
        return hourCheck;
    }

    public boolean isMinuteCheck() {
        return minuteCheck;
    }

    public boolean isSecondCheck() {
        return secondCheck;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    protected void showClock() {
        double radius = Math.min(w, h) * 0.8 * 0.5;
        double centerX = w / 2;
        double centerY = h / 2;

        Circle circle = new Circle(centerX, centerY, radius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5, centerY - radius + 12, "12");
        Text t2 = new Text(centerX - radius + 3, centerY + 5, "9");
        Text t3 = new Text(centerX + radius - 10, centerY + 3, "3");
        Text t4 = new Text(centerX - 3, centerY + radius - 3, "6");

        double sLength = radius * 0.8;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);

        double mLength = radius * 0.65;
        double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, minuteX, minuteY);
        mLine.setStroke(Color.BLUE);

        double hLength = radius * 0.5;
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);

        getChildren().clear();
        getChildren().addAll(circle, t1, t2, t3, t4);

        if (this.hourCheck) {
            getChildren().add(hLine);
        }
        if (this.minuteCheck) {
            getChildren().add(mLine);
        }
        if (this.secondCheck) {
            getChildren().add(sLine);
        }
    }
}
