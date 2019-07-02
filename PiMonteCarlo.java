import java.util.Random;
import java.math.*;

public class PiMonteCarlo {
	
	public static void main(String args[]) {
		
		Random r1 = new Random();
		Random r2 = new Random();
		long numberOfPoints = 10000000;
		long pointsInsideCircle = 0;
		int i = 0;
		while(i < numberOfPoints) {
			if(withinCircle(r1.nextDouble(), r2.nextDouble()))
				pointsInsideCircle++;
			i++;
		}
		double d = pointsInsideCircle / (double)numberOfPoints;
		double pi = d * 4;
		System.out.println(pi);
	}
	
	public static boolean withinCircle(double x, double y) {
		return (((x*x)+(y*y)) <= 1);
	}
}
