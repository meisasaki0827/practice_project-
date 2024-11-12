package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		int answer, val;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				answer = i * j; //九九 計算処理
				val = String.valueOf(answer).length(); //解の桁数を確認
				if (val == 1) {
					System.out.print("  " + answer); //1桁の場合 2文字分の空白を追加
				} else {
					System.out.print(" " + answer); //2桁の場合 1文字文の空白を追加
				}
			}
			System.out.println(); //九九の段 切り替わりの改行
		}

	}

}
