package ca.uvic.seng330.m4;

public class Gear {
  private int chainring, cog, rim;
  private float tire;
  public Gear(int chainring, int cog, int rim, float tire) {
    this.chainring = chainring;
    this.cog = cog;
    this.rim = rim;
    this.tire = tire;
  }

  public double gear_inches() {
    return ratio() * new Wheel(rim, tire).diameter();
  }
  private double ratio() {
    return chainring / (float) cog;
  }

  public static void main(String[] args) {
    System.out.println(new Gear(52,11,26,1.5f).gear_inches());
  }
}
