package ca.mcgill.cs.swdesign.m2;

import ca.uvic.seng330.m2.Car;

import java.util.ArrayList;
import java.util.Iterator;

public class Fleet implements Iterable {
  ArrayList<Car> fleet = new ArrayList<Car>();

  /**
   * Returns an iterator over elements of type {@code T}.
   *
   * @return an Iterator.
   */
  @Override
  //both work - but in the first one we use the built in iterator for arraylist.
//  public Iterator iterator() {
//    return fleet.iterator();
//  }
  public Iterator iterator() { return new FleetIterator();}
}
