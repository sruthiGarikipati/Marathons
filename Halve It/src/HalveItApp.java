import java.util.Scanner;
public class HalveItApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		 HalveIt  H =new  HalveIt();
		double d =HalveIt.halveTheNumber(num);
		System.out.println(d);
	}

}
