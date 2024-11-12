package method.q06;

public class Circle {

	public static void main(String[] args) {
		double radius = 5.0, area = getCircleArea(radius);
		System.out.println("半径：" + radius);
		System.out.println("円の面積：" + String.format("%.1f",area));
	}

	static double getCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
