package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int min = 1, max = 100;
		System.out.println("最小値；" + min);
		System.out.println("最大値：" + max);
		System.out.println("加算結果：" + sumLoop(min, max));
	}

	static int sumLoop(int min, int max) {
		int total = 0;
		for (int i = min; i <= 100; i++) {
			total = total + i;
		}
		return total;
	}
}
