package ca.uvic.seng330.m2;

import java.util.Comparator;

public class Car  implements Comparable {

  public final int topSpeed;
  public final int accel;

  public Car(int topSpeed) {
    this.topSpeed = topSpeed;
  }

  public int compareTo(Car o, feature f) {
    innerCompare(o, feature);
//    return topSpeed - o.topSpeed;
    //what if we want to compare on
    // acceleration?
    return o.accel - this.accel;
  }

  private int innerCompare(Car, feature) {
    if feature=speed //dosomething
  }




















  //factory method
  public static Comparator<Car> createByRankComparator() {
    return new Comparator<Car>() {
      @Override
      public int compare(Car pCar1, Car pCar2) {
        return pCar1.topSpeed - pCar2.topSpeed;
        true True true
      }
    };
  }

  class BySpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
      return o1.topSpeed - o2.topSpeed;
    }
  }
}

