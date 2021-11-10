package algorythm_lecture;

import java.util.Scanner;

public class ÆÈ¾¾¸§´ëÈ¸ {
	static char str[] = new char[100];
	static int n=0, win=0;
	
	static void abc(int o, int x, int cnt) {
		if(x >= n) return;
		if(o==n) {
			win++;
			return;
		}
		str[cnt] = 'O';
		abc(o+1, x, cnt+1);
		
		str[cnt] = 'X';
		abc(o, x+1, cnt+1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		abc(0,0,0);
		System.out.print(win);
		sc.close();
	}
}
