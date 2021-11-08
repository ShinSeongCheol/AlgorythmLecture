package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_109 {

	public static int n, p=0, cnt=0;;
	public static int line[];
	public static int arr[] = new int[3];

	public Problem_109() {
		recu(0);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		line = new int[n];

		for (int i = 0; i < n; i++) {
			line[i] = Integer.parseInt(br.readLine());
		}

		new Problem_109();
		
		System.out.println(cnt);
	}

	private void recu(int idx) {
		if (idx == 3) {
			int circleLine[] = new int[3];
			
			for(int i=0; i<3; i++) {
				circleLine[i] = arr[i];
			}
			
			Arrays.sort(circleLine);
			
			if(circleLine[0] + circleLine[1] > circleLine[2])
				cnt++;
			
			return;
		}

		for (int i = p; i < n; i++) {
			arr[idx] = line[i];
			p = i+1;
			recu(idx + 1);
		}
	}
}
