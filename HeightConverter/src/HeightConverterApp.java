import java.util.Scanner;

public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double inches=scan.nextDouble();
		HeightConverter HeatConverter =new HeightConverter ();
		double d=HeatConverter.convertInchesToFeet(inches);
		System.out.println(d);
	}

}
