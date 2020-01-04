package ca.uvic.seng330.m4;

public class EvenSumExample {

	int evensum(int i) {
		int sum = 0;
		while (i <= 10) { 
			if (i/2 == 0) {
				sum = sum + i; 
			}
			i++;
		}
	return sum;
	}
}
