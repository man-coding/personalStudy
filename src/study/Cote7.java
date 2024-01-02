package study;

import java.util.ArrayList;

public class Cote7 {

	public static int[] solution(int[] arr) {

		int index = 0;
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		int[] answer = { max, index };
		return answer;
	}

	public static void main(String[] args) {

		int[] Array1 = { 5, 1, 2, 5, 6, 4 };
		int[] result = solution(Array1);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}