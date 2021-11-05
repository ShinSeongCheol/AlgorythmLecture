package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_107 {
	
	public static int n,m,p=0;
	public static int num[],arr[];
	
	public Problem_107() {
		card(0);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		num = new int[n];
		arr = new int[m];
		
		for(int i=0; i<n; i++)
			num[i] = Integer.parseInt(br.readLine());
		
		new Problem_107();
	}
	
	private void card(int idx) {
		if(idx == m) {
			for(int i=0; i<m; i++)
				System.out.print(arr[i]);
			System.out.println();
			return;
		}
		
		for(int i=p; i<n; i++) {
			p = i+1;
			arr[idx] = num[i];
			card(idx+1);
		}
	}
}
