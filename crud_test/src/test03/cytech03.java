package test03;

import java.time.Instant;

public class cytech03 {

	public static void main(String[] args) {
		// 1970年1月1日00:00:00から現在までの秒数を取得
		long instant = Instant.now().getEpochSecond();

		if(instant % 2 == 0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}
		
	}

}
