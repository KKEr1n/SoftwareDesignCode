package ca.uvic.seng330.m9;

public class SCounter {

  private int counter = 0;
  // increment counter by one
  public void run() {
    int cnt = counter;
    counter = cnt + 1; // = counter++
  }

  public int counter() {
    return counter;
  }
}
