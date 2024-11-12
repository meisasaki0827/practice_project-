package method.q04;

public class SumNumbers {

	public static void main(String[] args) {
		int result = calculateSum(3, 2);
		System.out.println("加算結果：" + result);
	}

	static int calculateSum(int num1, int num2) {
		System.out.println("第一引数；" + num1);
		System.out.println("第二引数：" + num2);
		return num1 + num2;
	}

}
