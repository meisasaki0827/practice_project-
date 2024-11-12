package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		int[] array = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		System.out.println(Arrays.toString(array) + "には、偶数が" + getEvenNumbers(array) + "個あります。");
		// Arrays.toString(***)配列要素全て出力
	}

	static int getEvenNumbers(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			// 配列の各要素 偶数の場合count+1
			if (array[i] % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}
}
