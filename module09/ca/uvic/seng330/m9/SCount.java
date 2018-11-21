package ca.uvic.seng330.m9;

// current value of counter
public class SCount {

  public static void main(String[] args) {
    SCounter counter = new SCounter();
    counter.run(); // increment once
    counter.run(); // increment twice
    // print  final value of counter
    System.out.println(counter.counter());
  }
}






