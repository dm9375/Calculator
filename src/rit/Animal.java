package rit;
/**
 * This Object represents all types of animals.
 */
public class Animal {

  private int getNumberOfLegs;

  public Animal(int getNumberOfLegs) {
    this.getNumberOfLegs = getNumberOfLegs;
  }

  public int getNumberOfLegs() {
    return getNumberOfLegs;
  }

  public String move() {
    return null;
  }

}