package test06;

public class cytech06 {

	public static void main(String[] args) {
		//100未満の自然数の内、3の倍数の数字のみを出力
		
		for(int i=1 ; i < 100 ; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
