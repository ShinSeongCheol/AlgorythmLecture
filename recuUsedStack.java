package algorythm_lecture;

import java.util.Scanner;

public class recuUsedStack {
	
	private static int n;
	private static int cnt;
	private static int[] a = new int[20000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recuUsedStack rus = new recuUsedStack();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		cnt = 1;
		stack(0, a[cnt]);
	}

	private static void stack(int i, int j) {
		do {
			if(i >= j)
				return;
			else {
				cnt++;
				stack(j, a[cnt]);
				System.out.println(j);
				j = a[cnt];
			}
		}while(cnt <= n);
	}
}
