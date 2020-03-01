package ca.uvic.seng330.m4;

public class Equipment {
  private final String name;
  private int quantity;

// constructor

  Equipment(Equipment e) {
    //here we 'violate' private restriction,
    //but allowed because same object
    this.name = e.name;
    this.quantity = e.quantity;
  }

  Equipment(String name, int q) {
    this.name = name;
    quantity = q;
  }

  public void setQuantity(int q) {
    quantity = q;
  }

}
