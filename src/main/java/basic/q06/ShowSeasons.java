package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		int month = 13;
		String season = null;
		
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "冬";
			break;
			
		case 3:
		case 4:
		case 5:
			season = "春";
			break;
			
		case 6:
		case 7:
		case 8:
			season = "夏";
			break;
			
		case 9:
		case 10:
		case 11:
			season = "秋";
			break;
			
		default:
			season = "存在しない";
			break;
		}
		
		System.out.println(month + "月は" + season + "です。");
	}

}