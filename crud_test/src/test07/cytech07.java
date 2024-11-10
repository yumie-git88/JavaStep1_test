package test07;

public class cytech07 {

	public static void main(String[] args) {
		//for文を使い、文字 「'あ' 〜 'ん'」 までの範囲でループを行い
		//文字 「'て'」 のみを出力
		
		for(char c = 'あ'; c <= 'ん'; c++) {
			if (c == 'て') {
				System.out.println(c);
			}
		}
	}

}
