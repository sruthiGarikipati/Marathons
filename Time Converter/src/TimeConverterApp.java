import java.util.Scanner;
public class TimeConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int minutes=scan.nextInt();
		TimeConverter TimeConverter=new TimeConverter();
	double d=	TimeConverter.convertToHours(minutes);
	System.out.println(d);
	}

}
