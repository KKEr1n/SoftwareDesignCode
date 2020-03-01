package ca.uvic.seng330.m4;

public class Wheel {
  private int rim;
  private float tire;

  public Wheel(int rim, float tire) {
      this.rim = rim; this.tire = tire;
  }
  public double diameter() {
    return rim + (tire * 2);
  }
}
