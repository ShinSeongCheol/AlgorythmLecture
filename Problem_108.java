package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_108 {

	public static int n, r, p = 0;
	public static int arr[];
	public static boolean visited[];

	public Problem_108() {
		System.out.println(P(n, r));
		recu(0);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		arr = new int[r];
		visited = new boolean[n];
		
		new Problem_108();
	}

	private int P(int n, int r) {
		if (r == 1) {
			return n;
		}
		return P(n, 1) * P(n - 1, r - 1);
	}
	
	private void recu(int idx) {
		if(idx == r) {
			for(int i=0; i<r; i++) {
				char c = (char) (arr[i] +65);
				System.out.print(c);
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(visited[i] != true) {
				visited[i] = true;
				arr[idx] = i;
				recu(idx+1);
				visited[i] = false;
			}
		}
	}
}
