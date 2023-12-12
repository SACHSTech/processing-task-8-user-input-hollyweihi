import processing.core.PApplet;

public class Sketch extends PApplet {
  String message = "";
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  float circleX = 150;
  float circleY = 150;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(51,204,255);
  }
  public void draw() {
  if (mousePressed) {
    fill(102,255,102);
    ellipse(mouseX, mouseY, 25, 25);
  
    textSize(100);
    text(message, 50, 180);
  }
  if (upPressed) {
      circleY--;
    }
  if (downPressed) {
      circleY++;
    }
  if (leftPressed) {
      circleX--;
    }
  if (rightPressed) {
      circleX++;
    }
  
    ellipse(circleX, circleY, 30, 30);
  }

  public void mouseClicked() {
    fill(255, 128, 0);
    ellipse(mouseX-10, mouseY-30, 30, 30);
    ellipse(mouseX-10, mouseY-50, 30,30);
    ellipse(mouseX-30, mouseY-30, 30,30);
    ellipse(mouseX-30, mouseY-50, 30,30);

    fill(255, 0, 0);
    ellipse(mouseX-20, mouseY-40, 30,30);
  }

  public void keyTyped() {
      message += key;
  }

  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }else if (keyCode == DOWN) {
      downPressed = true;
    }else if (keyCode == LEFT) {
      leftPressed = true;
    }else if (keyCode == RIGHT) {
      rightPressed = true;
    }
    }
      
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }else if (keyCode == DOWN) {
      downPressed = false;
    }else if (keyCode == LEFT) {
      leftPressed = false;
    }else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }
}