package ca.uvic.seng330.m9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Arrays;

public class ParticleApplication extends Application {

  protected Thread[] threads;
  protected final ParticleGroup group = new ParticleGroup(100);

  @Override
  public synchronized void start(Stage primaryStage) throws Exception {
//    add(canvas);
    Scene scene = new Scene(group, 100, 100);
    primaryStage.setScene(scene);

    int n = 10;
    if (threads == null) {
      Particle[] particles = new Particle[n];
      Arrays.fill(particles, new Particle(50,50));
      group.setParticles(particles);
      threads = new Thread[n];
      int i = 0;
      for(Particle p: particles) {
        threads[i] = makeThread(p);
        threads[i].setName("Particle Thread" + i);
        threads[i].start();
        i++;
      }
    }
    primaryStage.show();
  }

  @Override
  public synchronized void stop() {
    if(threads != null) {
      for(Thread t: threads) {
        t.interrupt();
      }
      threads = null;
    }
  }

  protected Thread makeThread(final Particle p) {
    Runnable runloop = new Runnable() {
      @Override
      public void run() {
        try {
          for(;;) {
            p.move();
            p.draw(group);
            Thread.sleep(100);
          }
        } catch (InterruptedException e) {
//          e.printStackTrace();
          return;
        }
      }
    };
    return new Thread(runloop);
  }
}
