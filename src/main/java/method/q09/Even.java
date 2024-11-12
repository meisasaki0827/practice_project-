package method.q09;

public class Even {

	public static void main(String[] args) {
		int num = 10;
		String result = "";

		if (checkEven(num) == "true") {
			result = "偶数";
		} else if (checkEven(num) == "false") {
			result = "奇数";
		}

		System.out.println(num + "は" + result + "です。");
	}

	static String checkEven(int num) {
		if (num % 2 == 0) {
			return "true";
		} else {
			return "false";
		}
	}
}
