package algorythm_lecture;

public class ���μ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���μ�����  a = new ���μ�����();
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
