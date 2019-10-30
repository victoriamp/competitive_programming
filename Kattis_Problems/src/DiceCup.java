import java.util.*;

public class DiceCup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		HashMap<Integer, Integer> odds = new HashMap<>();
		for(int i = 1; i<=n; i++) 
			for(int j = 1; j<=m; j++) {
				if(odds.containsKey(i+j))
					odds.put(i+j, odds.get(i+j) + 1);
				else
					odds.put(i+j, 1);
			}
		int max = 0;
		for(int amt : odds.keySet())
			max = Math.max(max,  odds.get(amt));
		for(int amt : odds.keySet())
			if(odds.get(amt)==max)
				System.out.println(amt);
	}

}
