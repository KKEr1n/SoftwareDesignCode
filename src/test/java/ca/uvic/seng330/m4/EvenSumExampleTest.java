package ca.uvic.seng330.m4;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenSumExampleTest
{

	@Test
	public void testSums()
	{
		EvenSumExample e = new EvenSumExample();
		
		assertEquals(28, e.evensum(4));
	}

}
