package algorythm_lecture;

public class 최대공약수 {

	public static void main(String[] args) {
		최대공약수 a = new 최대공약수();
		a.gcm(20,48);
	}

	private void gcm(int x, int y) {
		if(x%y== 0) {
			System.out.println();
			return;
		}
		gcm(y, x%y);

	}
}
