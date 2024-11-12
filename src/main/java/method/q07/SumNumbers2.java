package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		int num1 = 5;
		double num2 = 3.3;
		System.out.println("第一引数（整数）：" + num1);
		System.out.println("第二引数（実数）：" + num2);
		System.out.println("加算結果：" + calculateSum(num1, num2));
	}

	static int calculateSum(int num1, double num2) {
		int result = (int) (num1 + num2); //型の異なる計算 (int)型にキャスト
		return result;
	}

}
