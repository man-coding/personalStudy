package study;

import java.lang.Math;   // java.lang.Math 클래스 호출 
//Math. pow(a,b) a의 b제곱 구할 수 있음.						
//Math.sqrt(a) 를 이용하여 a 제곱근을 구할 수 있음.

public class Cote3 {

	public static int dice(int a, int b, int c) {

		int answer;
		if (a != b && b != c && c != a) {
			answer = a + b + c;
		} else if (a == b && b == c) {
			answer = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
					* ((int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
		} else {
			answer = (a + b + c) * ((int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));

		}
		return answer;

	}

	public static void main(String[] args) {

		int num1 = 4;
		int num2 = 4;
		int num3 = 4;


		int result = dice(num1, num2, num3);
		System.out.println(result);
		

	}//aasdssss//aaaaaaaaaaa
}
