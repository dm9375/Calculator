package rit;
/**
 * This Object represents all dogs.
 */
public class Dog extends Animal {

  public Dog()
  {
    super(4);
  }

  @Override
  public int getNumberOfLegs() {
    return super.getNumberOfLegs();
  }

  @Override
  public String move() {
    return "chase my tail";
  }

}