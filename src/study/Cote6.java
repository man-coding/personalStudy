package study;

import java.lang.Math;

class Solution1 {
	public int solution(int a, int b, int c, int d) {
		int answer = 0;
		int p;
		int q;
		int r;

		if (a == b && b == c && c == d) { // 모두 같은 값
			answer = 1111 * a; // 첫번째 리턴값
		} else if ((a == b && b == c) || (b == c && c == d) || (c == d && d == a) || d == a && a == b) {// 3개씩 같은 값

			if (a == b && b == c) {
				p = a;
				q = d;
			} else if (b == c && c == d) {
				p = b;
				q = a;
			} else if (c == d && d == a) {
				p = c;
				q = b;
			} else { // d == a && a==b
				p = d;
				q = c;
			}
			answer =  (int) Math.pow((10 * p + q), 2); // 두번째 리턴값

		} else if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) { // 2개씩 같은 값

			if ((a == b && c == d)) {
				p = a;
				q = c;
			} else if (a == c && b == d) {
				p = a;
				q = b;
			} else { // a == d && b == c
				p = a;
				q = b;
			}
			answer = (p + q) * (Math.abs(p - q)); // 세번째 리턴값

		} else if (a == b || a == c || a == d || b == c || b == d || c == d) { // 2개가 같은 값 나머지 2개는 서로 다른값

			if (a == b) {
				p = a;
				q = c;
				r = d;
			} else if (a == c) {
				p = a;
				q = b;
				r = d;
			} else if (a == d) {
				p = a;
				q = b;
				r = c;
			} else if (b == c) {
				p = b;
				q = a;
				r = d;
			} else if (b == d) {
				p = b;
				q = a;
				r = c;
			} else { // c == d
				p = c;
				q = a;
				r = b;
			}
			answer = q * r; // 네번째 리턴값
		} else { // 전부 다른 값
			int minNum = Math.min(Math.min(a, b), Math.min(c, d)); // 다섯번째 리턴값
			answer = minNum;
		}
		return answer;

	}
}

public class Cote6 {

}