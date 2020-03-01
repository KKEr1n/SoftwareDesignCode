package ca.uvic.seng330.m4;

public class EvenSumExample {
  /**
   * @pre
    * @param i
   * @return
   */
	int evensum(float i) {
		int sum = 0;
		while (i <= 10) { 
			if (i/2 == 0) {
//				sum = sum + i;
			}
			i++;
		}
	return sum;
	}

}
