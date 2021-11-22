package algorythm_lecture;

import java.util.Scanner;

public class ÀÌÁøÅ½»ö {
	public static int n,m;
	public static int arr[] = new int[1001];
	
	
	public static int BS(int st, int ed, int cnt) {
		int mid = (st+ed)/2;
		System.out.println(st + " " + ed + " " + mid + " " + cnt);
		if(st>ed) return -1;
		if(arr[mid]>m) BS(st, mid-1, cnt+1);
		if(arr[mid]<m) BS(mid+1, ed, cnt+1);
		if(arr[mid] == m) { return cnt;}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println(BS(0,n-1,0));
	}
}
