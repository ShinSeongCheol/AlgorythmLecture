package algorythm_lecture;

public class 소인수분해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		소인수분해  a = new 소인수분해();
		a.prime(30,2);
	}

	private void  prime(int x, int y) {
		if(x == 1) return;
		if(x%y==0) {
			System.out.println(y);
			prime(x/y,y);
		}
		else {
			prime(x,y+1);
		}
	}
}
