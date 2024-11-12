package method.q05;

public class Triangle {

	public static void main(String[] args) {
		int botton = 8, hight = 5;
		System.out.println("底辺；" + botton);
		System.out.println("高さ：" + hight);
		System.out.println("三角形の面積：" + getTriangleArea(botton, hight));
	}

	static int getTriangleArea(int botton, int hight) {
		int area = botton * hight / 2;
		return area;
	}

}
