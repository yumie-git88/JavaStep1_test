package test04;

import java.time.Instant;

public class cytech04 {

	public static void main(String[] args) {
		// 1970年1月1日00:00:00から現在までの秒数を取得
		//switchは　longから (int) へ変更
		int instant = (int) Instant.now().getEpochSecond();

		switch (instant % 2) {
		case 0:
			System.out.println("偶数です");
			break;
			
		case 1:
			System.out.println("奇数です");
			break;

		default:
			break;
		}

	}

}
