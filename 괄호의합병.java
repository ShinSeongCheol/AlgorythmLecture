package algorythm_lecture;

import java.util.Scanner;

public class °ýÈ£ÀÇÇÕº´ {
	static int arr[] = new int[103];
	static int n,m,result=0;
	
	public static void abc(int cnt, int o, int c) {
		if(o>n || c>n || c>o || o-c<m) return;
		if(c==n && o==n) {
			result++;
			return;
		}
		
		arr[cnt] = 0;
		abc(cnt+1, o+1, c);
		
		arr[cnt] = 1;
		abc(cnt+1, o, c+1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		abc(1,0,0);
		System.out.println(result);
	}
}
