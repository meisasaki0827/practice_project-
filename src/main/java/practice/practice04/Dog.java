// Animalを継承したサブクラス
package practice.practice04;

public class Dog extends Animal {
	private String furColor;

	public Dog(String name, int age, String furColor) {
		super(name, age); // スーパークラスのコンストラクタを呼び出す
		this.furColor = furColor;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	@Override
	public void showInfo() {
		System.out.println("名前：" + getName());
		System.out.println("年齢：" + getAge())

		;
		System.out.println("毛の色：" + furColor);
	}

	public void cry() {
		System.out.println("鳴き声：ワン");
	}
}
