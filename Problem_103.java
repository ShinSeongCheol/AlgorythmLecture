package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_103 {
	
	static int prime = 2;
	
	public Problem_103(int num) {
		recu(num);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		new Problem_103(Integer.parseInt(br.readLine()));
	}
	
	private void recu(int num) {
		if(num == 1) {
			return;
		}
		
		if(num%prime == 0) {
			System.out.print(prime + " ");
			recu(num/prime);
		}else {
			prime++;
			recu(num);
		}
	}
}
