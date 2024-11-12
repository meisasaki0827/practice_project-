package method.q09;

public class Even {

	public static void main(String[] args) {
		int num = 10;
		String result = "";

		// メソッドの戻り値によって偶数or奇数をresultに代入
		if (checkEven(num) == "true") {
			result = "偶数";
		} else if (checkEven(num) == "false") {
			result = "奇数";
		}

		System.out.println(num + "は" + result + "です。");
	}

	static String checkEven(int num) {
		// 引数が偶数の場合"true" 奇数の場合"false"
		if (num % 2 == 0) {
			return "true";
		} else {
			return "false";
		}
	}
}
