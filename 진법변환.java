package algorythm_lecture;

public class ������ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		������ȯ a = new ������ȯ();
		a.recu(20);
	}

	private void recu(int cnt) {
		if(cnt == 0)	return;
		recu(cnt/2);
		System.out.println(cnt%2);
	}
}
