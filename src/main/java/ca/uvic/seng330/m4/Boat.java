package ca.uvic.seng330.m4;

import java.util.ArrayList;

public class Boat {
  private ArrayList<Equipment> gear;
  private int aCapacity;

  public Boat(int cap) {
    //constructor initializing boat
    this.aCapacity = cap;
  }

  public ArrayList<Equipment> getEquipment() {
      ArrayList<Equipment> result = new ArrayList<>();
      for( Equipment equip : gear )
      {
        result.add(new Equipment(equip)); }
      return result;
  }
  public static void main(String[] args) {
    Boat b = new Boat(59);
    b.add(new Equipment("paddle",45));
    b.add(new Equipment("GPS",33));
    ArrayList<Equipment> newE = b.getEquipment();
  }

  private void add(Equipment e) {
    if(gear == null) gear = new ArrayList<Equipment>();
    gear.add(e);
  }
}

