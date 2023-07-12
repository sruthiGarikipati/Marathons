package cube;
import java.util.Scanner;

public class cubeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		cubeNumber cubeNumber=new cubeNumber();
		int res =cubeNumber.cube(a);
		System.out.println(res);
	}

}
