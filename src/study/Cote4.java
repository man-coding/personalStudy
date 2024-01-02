package study;

import java.util.Scanner;

public class Cote4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);   // 스캐너 객체 생성
		String str = sc.nextLine();
		


		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // str 문자열에서 i번째 문자를 char 타입으로 변환 후 리턴
			System.out.println(ch);  // char 타입 변수 b를 출력	

			
//			char a = str.charAt(4);   -> str 문자열에서 5번째 문자를 char 타입으로 변환하여 리턴
//			System.out.println(a);
//			System.out.println();
		}

	}
}
