package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_104 {
	
	public Problem_104(int num) {
		System.out.print(fact(num));
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		new Problem_104(Integer.parseInt(br.readLine()));
	}
	
	private int fact(int num) {
		if(num == 1) {
			return 1;
		}
		return num * fact(num-1);
	}
}
