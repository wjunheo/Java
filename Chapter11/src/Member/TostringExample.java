package Member;

import java.sql.Date;

public class TostringExample {

	public static void main(String[] args) {
		String ssn = "920511-1234567";
		char sex =ssn.charAt(7);
		switch(sex) {
		case '1':
		case '2':
			System.out.println("homen");
			break;
		case '3':
		case '4':
			System.out.println("mulher");
			break;
		}
	}

}
