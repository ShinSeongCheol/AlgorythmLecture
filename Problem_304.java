import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_304 {

	public static int n;
	public static int m;
	public static int arr[][] = new int[50][50];
	public static int count=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			arr[x][y] = 1;
		}

		for(int i=1; i<=n; i++)
			DFS(i, 1);
		
		System.out.println(count);
	}

	public static void DFS(int start, int cnt) {
		for(int i=1; i<=n; i++) {
			if(count<cnt) count=cnt;
			if(arr[start][i]==1)
				DFS(i,cnt+1);
		}
		
	}
}
