import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_302 {
	
	public static int arr[][] = new int[101][101];
	public static int visit[] = new int[101];
	public static int numberOfComputers;
	public static int line;
	public static int count=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		numberOfComputers = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		for(int i=0; i<line; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		dfs(1);
		System.out.println(count);
	}
	
	public static void dfs(int startPoint) {
		visit[startPoint] = 1;
		for(int i=1; i<=numberOfComputers; i++) {
			if(arr[startPoint][i] == 1 && visit[i] == 0) {
				count++;
				dfs(i);
			}
		}
	}
}
