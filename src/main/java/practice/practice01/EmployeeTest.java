package practice.practice01;

public class EmployeeTest {

	public static void main(String[] args) {
		// Employeeオブジェクト インスタンス化
		 Employee e1 = new Employee();		
		// メンバにアクセス 値を設定
		e1.name = "山田";
		e1.age = 20;
		
		e1.showInfo();
		
		System.out.println("----------");
		
		Employee e2 = new Employee();		
		e2.name = "鈴木";
		e2.age = 30;	
		
		e2.showInfo();
		

	}

}