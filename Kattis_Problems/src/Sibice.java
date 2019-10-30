import java.util.*;
public class Sibice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		double capacity = w*w + h*h;

		for(int i = 0; i<n; i++) {
			int match = sc.nextInt();
			if((double)match<=capacity)
				System.out.println("DA");
			else
				System.out.println("NE");
		}
	}
}
