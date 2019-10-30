import java.util.*;
public class Tarifa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		x*=(n+1);
		for(int i = 0; i<n; i++) {
			x-=sc.nextInt();
		}
		System.out.println(x);

	}

}
