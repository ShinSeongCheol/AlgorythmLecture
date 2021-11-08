package algorythm_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Problem_110 {

	public static int n;
	public static boolean visited[];
	public static Stack<Integer> stack = new Stack<Integer>();
	
	public Problem_110() {
		recu(0);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visited = new boolean[n];

		new Problem_110();
	}

	private void recu(int idx) {
		if (idx == n) {
			return;
		}

		stack.push(idx);
		for(int i : stack)
			System.out.print((char)(i+'a'));
		System.out.println();
		recu(idx + 1);
		
		stack.pop();
		recu(idx + 1);
	}
}
