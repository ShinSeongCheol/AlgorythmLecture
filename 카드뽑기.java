package algorythm_lecture;

import java.util.Scanner;

public class Ä«µå»Ì±â {

	private static int arr[] = new int[10];
	private static int n,m,p=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ä«µå»Ì±â  a = new Ä«µå»Ì±â();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a.card(0);
		sc.close();
	}

	private void card(int cnt) {
		if(cnt == n) {
			for(int i=0; i<n; i++)
				System.out.print(arr[i]);
			System.out.println();
			return;
		}
//		arr[cnt] = 1;
//		card(cnt+1);
//		arr[cnt] = 2;
//		card(cnt+1);
//		arr[cnt] = 3;
//		card(cnt+1);
		
		for(int i=p; i<=m; i++) {
			p = i+1;
			arr[cnt] = i+1;
			card(cnt+1);
		}
		
	}
}
