package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_111 {

	public static int v, h;
	public static int arr[], data[] = new int[27];
	public static boolean visited[];


	public Problem_111() {
		recu(0);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		v = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		arr = new int[h];
		visited = new boolean[30];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < v; i++) 
			data[Integer.parseInt(st.nextToken())]++;

		new Problem_111();

	}

	private void recu(int idx) {
		if (idx == h) {
			for (int i = 0; i < h; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}

		for (int i = 0; i < data.length; i++) {
			if(data[i] != 0) {
				data[i]--;
				arr[idx] = i;
				recu(idx + 1);
				data[i]++;
			}
		}
	}
}
