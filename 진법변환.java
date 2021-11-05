package algorythm_lecture;

public class 진법변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		진법변환 a = new 진법변환();
		a.recu(20);
	}

	private void recu(int cnt) {
		if(cnt == 0)	return;
		recu(cnt/2);
		System.out.println(cnt%2);
	}
}
