import java.util.Scanner;
public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double fahrenheit=scan.nextDouble();
		
		TemperatureConverter   TemperatureConverter = new TemperatureConverter ( );
		double f=TemperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.printf("%.2f",f);
		
		
		
		
		
	}

}
