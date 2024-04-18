import processing.core.PApplet;

public class ProcessingUsingProcedural extends PApplet{
    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;
    public static final int DIAMETER = 10;
    int positionX1, positionX2,positionX3,positionX4=0;
    int positionY1,positionY2,positionY3,positionY4;
    int frameRate1,frameRate2,frameRate3,frameRate4;
    public static void main(String[] args) {
      PApplet.main("ProcessingUsingProcedural",args);
    }


    public void settings() {
        size(WIDTH, HEIGHT);
    }
    public void setup(){
         positionY1=HEIGHT/5;
         positionY2=(2*HEIGHT)/5;
         positionY3=(3*HEIGHT)/5;
         positionY4=(4*HEIGHT)/5;
         frameRate1=1;
         frameRate2=2;
         frameRate3=3;
         frameRate4=4;

    }
    public void draw(){
        drawHorizontalMovingCircleWithParams(positionX1,positionY1, frameRate1);
        drawHorizontalMovingCircleWithParams(positionX2,positionY2, frameRate2);
        drawHorizontalMovingCircleWithParams(positionX3,positionY3, frameRate3);
        drawHorizontalMovingCircleWithParams(positionX4,positionY4, frameRate4);

    }

    private void drawHorizontalMovingCircleWithParams(int positionX, int positionY,int frameRate) {
        ellipse(positionX,positionY,DIAMETER,DIAMETER);
        switch(frameRate){
            case 1:
                positionX1+=frameRate;
                break;
            case 2:
                positionX2+=frameRate;
                break;
            case 3:
                positionX3+=frameRate;
                break;
            case 4:
                positionX4+=frameRate;
                break;
        }

    }

}
