package algorythm_lecture;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f = new factorial();
		System.out.println(f.fact(5));
	}

	private int fact(int cnt) {
		if(cnt == 1)
			return 1;
		else
			return cnt * fact(cnt-1);
	}
}
