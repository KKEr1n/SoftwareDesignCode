//Original (AWT) code from Lea, Concurrent Programming in Java 2nd ed
//This version (c) Neil Ernst

package ca.uvic.seng330.m9;

import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Particle {
  protected int x;
  protected int y;
  protected final Random rng = new Random();

  public Particle(int initialX, int initialY) {
    x = initialX;
    y = initialY;
  }

  public synchronized void move() {
    //TODO: does not respect bound of scene
    x += rng.nextInt(10) - 5;
    y += rng.nextInt(20) - 10;
  }

  public void draw(Group g) {
    int lx, ly;
    // need a lock on setting the x and y values *concurrently*
    synchronized (this) { lx = x; ly = y;}
    System.out.println(lx);
    Rectangle rectangle = new Rectangle(lx, ly, 10,10);
    rectangle.setFill(Paint.valueOf("Red"));
    //JavaFX requires only the main JavaFX thread to update the scene
    Platform.runLater(new Runnable() {
      @Override public void run() {
        g.getChildren().add(rectangle);
      }
    });
  }
}
