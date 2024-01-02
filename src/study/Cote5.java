package study;

import java.lang.Math;

public class Cote5 {

	public static int solution(int n) {

		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % 2 == 1) {
				if (i % 2 == 1) {
					answer = answer + i;
				}

			} else {
				if (i % 2 == 0) {

					answer = answer + i * i;
				}
			}

		}
		return answer;
	}

	public static void main(String[] args) {

		int n1 = 6;
		int result = solution(n1);
		System.out.println(result);
	}

}
