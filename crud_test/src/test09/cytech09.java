package test09;

public class cytech09 {

	public static void main(String[] args) {
		//5人の学生の4つの科目の点数を格納した2次元配列を作成し、各学生の科目ごとの点数を表示
		//"国語", "数学", "理科", "社会"
		
		// 2次元配列の宣言と初期化 5人の学生の4つの科目の点数
		int[][] scores = {
			{88, 47, 37, 75},
			{68, 88, 90, 62},
			{74, 20, 40, 22},
			{40, 70, 64, 50},
			{90, 89, 100, 91}
		};
		
		// 科目名
		String[] subjects = {"国語", "数学", "理科", "社会"};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("学生 " + (i + 1) + "人目のテストの点数は");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(" " + subjects[j] +":" + scores[i][j] + "点");
			}
		}
		
	}

}
