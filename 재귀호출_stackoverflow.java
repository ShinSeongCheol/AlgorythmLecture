package algorythm_lecture;

public class ���ȣ��_stackoverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���ȣ��_stackoverflow a = new ���ȣ��_stackoverflow();
		a.recu(1);

	}

	private void recu(int cnt) {
		System.out.println(cnt);
		recu(cnt+1);
	}
}
