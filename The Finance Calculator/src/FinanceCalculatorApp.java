import java.util.Scanner;
public class FinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculator FinanceCalculator=new FinanceCalculator();
		double d=FinanceCalculator.calculateSimpleInterest(principal,rate,time);
		System.out.println(d);
		
	}

}
