package journeycalculator;
import java.util.Scanner;
public class JourneyCalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double speed=scan.nextDouble();
	double time=scan.nextDouble();
	JourneyCalculator JourneyCalculator=new JourneyCalculator();
	double d=JourneyCalculator.calculateDistance(speed,  time);
	System.out.printf("%.2f",d);
	
	
	
	
	
	
}
}
