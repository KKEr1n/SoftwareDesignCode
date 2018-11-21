package ca.uvic.seng330.m9;

import javafx.scene.Group;

public class ParticleGroup extends Group {

  private Particle[] particles = new Particle[0];

  ParticleGroup(int size) {
    super();
    paint();
  }

  protected synchronized void setParticles(Particle[] ps) {
    if(ps==null)
      throw new IllegalArgumentException("cannot set null");
    particles = ps;
  }

  protected synchronized Particle[] getParticles() {
    return particles;
  }

  public void paint() {
    Particle[] ps = getParticles();

    for(Particle p: ps) {
      p.draw(this);
    }
    this.requestLayout();
  }

}
