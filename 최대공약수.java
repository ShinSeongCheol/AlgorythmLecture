package algorythm_lecture;

public class �ִ����� {

	public static void main(String[] args) {
		�ִ����� a = new �ִ�����();
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
