package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_105 {
	
	public static int n;
	public static int arr[];
	
	public Problem_105() {
		card(0);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		new Problem_105();
	}
	
	private void card(int idx) {
		if(idx == n) {
			for(int i=0; i<n; i++)
				System.out.print(arr[i]);
			System.out.println();
			return;
		}
		
		arr[idx] = 0;
		card(idx+1);
		arr[idx] = 1;
		card(idx+1);
	}
}
