import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class ProcessingUsingOops extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;
    public static final int DIAMETER = 10;
    List<Circle> circlesList = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("ProcessingUsingOops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Circle circle1 = getCircleInstance(0, HEIGHT / 5, DIAMETER, DIAMETER, 1);
        Circle circle2 = getCircleInstance(0, (2 * HEIGHT) / 5, DIAMETER, DIAMETER, 2);
        Circle circle3 = getCircleInstance(0, (3 * HEIGHT) / 5, DIAMETER, DIAMETER, 3);
        Circle circle4 = getCircleInstance(0, (4 * HEIGHT) / 5, DIAMETER, DIAMETER, 4);
        addCircleToCircleList(circle1);
        addCircleToCircleList(circle2);
        addCircleToCircleList(circle3);
        addCircleToCircleList(circle4);
    }

    @Override
    public void draw() {
//        paintWhiteBackground();
        for (Circle circle : circlesList) {
            drawHorizontalMovingCircleWithParams(circle);
        }


    }

    private void addCircleToCircleList(Circle circle) {
        this.circlesList.add(circle);
    }

    private Circle getCircleInstance(int positionX, int positionY, int height, int width, int frameRate) {
        return new Circle(positionX, positionY, height, width, frameRate);
    }

    private void drawHorizontalMovingCircleWithParams(Circle circle) {
        int positionX = circle.getPositionX();
        int positionY = circle.getPositionY();
        int height = circle.getHeight();
        int width = circle.getWidth();
        int frameRate = circle.getFrameRate();
        ellipse(positionX, positionY, height, width);
        circle.setPositionX(positionX + frameRate);
    }

    private void drawCircle(int heightFromTop) {
        ellipse(mouseX, mouseY, DIAMETER, DIAMETER);


    }

    private void paintWhiteBackground() {
        background(255);
    }

    class Circle {
        private int positionX, positionY, height, width;
        private int frameRate = 1;

        public Circle(int positionX, int positionY, int height, int width) {
            this.positionX = positionX;
            this.positionY = positionY;
            this.height = height;
            this.width = width;
        }

        public Circle(int positionX, int positionY, int height, int width, int frameRate) {
            this.positionX = positionX;
            this.positionY = positionY;
            this.height = height;
            this.width = width;
            this.frameRate = frameRate;
        }

        public int getFrameRate() {
            return frameRate;
        }

        public void setFrameRate(int frameRate) {
            this.frameRate = frameRate;
        }

        public int getPositionX() {
            return positionX;
        }

        public void setPositionX(int positionX) {
            this.positionX = positionX;
        }

        public int getPositionY() {
            return positionY;
        }

        public void setPositionY(int positionY) {
            this.positionY = positionY;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
}
