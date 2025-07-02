import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) { 
			double t1 = sc.nextDouble();
			double t2 = sc.nextDouble();
			double t3 = sc.nextDouble();
			double media;
			media = (t1 * 2.0 + t2 * 3.0 + t3 * 5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}
     sc.close();
	}

}
