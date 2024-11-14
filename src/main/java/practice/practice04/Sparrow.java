package practice.practice04;

public class Sparrow extends Animal {
	private boolean iscanFly;

	public Sparrow(String name, int age, boolean iscanFly) {
		super(name, age); // スーパークラスのコンストラクタを呼び出す
		this.iscanFly = iscanFly;
	}

	public void setCanFly(boolean canFly) {
		this.iscanFly = canFly;
	}

	@Override
	public void showInfo() {
		System.out.println("名前：" + getName());
		System.out.println("年齢：" + getAge());

		if (iscanFly == true) {
			System.out.println("飛べます");
		}
	}

	public void cry() {
		System.out.println("鳴き声：チュンチュン");
	}
}
