
	import java.util.Scanner;
	public class Demo {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
		    System.out.println("Enter two strings");
		    String str1=scan.next();
		    String str2=scan.next();
		    System.out.println(joinStrings(str1,str2));
		    }
		public static String joinStrings(String str1, String str2)
		{
		return str1+str2;
		}
		
		
}
