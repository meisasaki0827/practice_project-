package practice.practice02;

public class EmployeesTest {

	public static void main(String[] args) {
		Employee employee = new Employee();

		//nameの値を設定 出力
		employee.setName("山田");
		System.out.println("氏名：" + employee.getName());

		//ageの値を設定 出力
		employee.setAge(20);
		System.out.println("年齢：" + employee.getAge());

	}

}
