package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_102 {

	public Problem_102(int m, int n) {
		recu(m, n);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		new Problem_102(m, n);
	}
	
	private void recu(int m, int n) {
		if(m%n == 0) {
			System.out.println(n);
			return;
		}
		recu(n, m%n);
	}

}
