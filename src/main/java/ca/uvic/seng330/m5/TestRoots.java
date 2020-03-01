package ca.uvic.seng330.m5;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestRoots {
  @Test
  public void testRoot1() {
    double[] res = Roots.roots(3,4,1);
    assertEquals(0.0,res[0]);
  }
  @Test
  public void testRoot2() {
    double[] res = Roots.roots(0,0,1);
    assertEquals(0.0,res[0]);
  }
//  @Test
//  public void testRoot3() {
//    double[] res = Roots.roots(3,2,1);
//    assertEquals(0.0,res[0]);
//  }
}
