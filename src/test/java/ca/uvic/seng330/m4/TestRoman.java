package ca.uvic.seng330.m4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRoman {


  @Before
  public void setup()
  {
    //some code, executed before every test
  }

  @Test
  public void TestSingle(){
    Roman2Decimal r = new Roman2Decimal("I");
    Assert.assertEquals("test output", r.convert(), 1);
    // multiple assertions? How many single do we need to be confident?
  }

  @Test(expected=IncorrectRomanNumeralException.class)
  public void TestIncorrectNumberString() {

  }
}