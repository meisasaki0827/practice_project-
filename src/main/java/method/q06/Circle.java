package method.q06;

public class Circle {

	public static void main(String[] args) {
		double radius = 5.0;
		System.out.println("半径：" + radius);
		System.out.println("円の面積：" + String.format("%.1f", getCircleArea(radius)));
		//String.format("%.1f",***)で小数点を指定
	}

	static double getCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}
