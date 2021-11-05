package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_101 {

	public Problem_101(int num) {
		recu(num);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		new Problem_101(Integer.parseInt(br.readLine()));
	}

	private void recu(int num) {
		if(num==0) {
			return;
		}
		recu(num/2);
		System.out.print(num%2);
	}
}
