package practice.practice02;

public class Employee {
	/**
	 * 名前
	 */
	private String name;

	/**
	 * 年齢
	 */
	private int age;

	/**
	 * 名前 アクセサメソッド
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 年齢 アクセサメソッド
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
