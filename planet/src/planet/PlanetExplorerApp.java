package planet;
import java.util.Scanner;

public class PlanetExplorerApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double radius=scan.nextDouble();
	PlanetExplorer PlanetExplorer=new PlanetExplorer();
	double R=PlanetExplorer.calculateSurfaceArea(radius);
	System.out.println(R);
	

    
}
}
