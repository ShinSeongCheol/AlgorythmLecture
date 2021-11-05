package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_106 {
	
	public static int n;
	public static int m[],arr[];
	
	public Problem_106() {
		card(0);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = new int[n];
		arr = new int[n];
		
		for(int i=0; i<n; i++)
			m[i] = Integer.parseInt(br.readLine());
		
		new Problem_106();
	}
	
	private void card(int idx) {
		if(idx == n) {
			for(int i=0; i<n; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			arr[idx] = m[i];
			card(idx+1);
		}
	}
}
