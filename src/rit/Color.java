package rit;
/**
 * This Object holds an RGB color definition.
 * 
 * WHAT PRICIPLE IS VIOLATED?
 * Well technically both the Law of Demeter & the Single Responsibility principles are being
 * violated based on the premise that coupling and cohesion have an inverse relationship
 * with each other so that means if these instance variables were creating interdependances
 * which shouldn't occur.
 */
public class Color {
  private int red;
  private int green;
  private int blue;

  public String getCssCode() {
    return "#"
        + Integer.toHexString(red)
        + Integer.toHexString(green)
        + Integer.toHexString(blue);
  }
}