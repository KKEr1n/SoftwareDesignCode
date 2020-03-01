package ca.uvic.seng330.m5;

public class Roots {

  /**
   * Finds the roots for ax^2 + bx + c
   */
  public static double[] roots(double a, double b, double c) {
    double q = b * b - 4 * a * c;
    if (q > 0 && a != 0) // Two roots
    {
      return new double[]{(-b + q) / 2 * a, (-b - q) / 2 * a};
    } else if (q == 0) // One root
    {
      return new double[]{-b / 2 * a};
    } else // No root
    {
      return new double[0];
    }
  }

}
