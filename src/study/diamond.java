package study;

public class diamond {

	public static void main(String[] args) {
		// 세로 라인
		for (int i = 1; i <= 4; i++) {

			// 가로 라인
			// 첫 번째 for문 공백문자, 두 번째 for문 *문자 출력
			for (int j = 1; j <= 4 - i; j++) { // j<=4-i <-이 식을 생각해내야 함
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) { // 출력을 늘릴 때는 곱한 후 빼야 함.
				System.out.print("*");
			}
			System.out.println(); // 한줄 출력 후 한줄 꼭 띄어야 함.
		}
		// 세로 라인
		for (int i = 1; i <= 3; i++) {
			// 가로 라인
			// 첫 번째 for문 공백문자, 두 번째 for문 *문자 출력
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 7 - i * 2; j++) { // 출력을 줄일 때는 큰 수를 정한 후 곱을 빼야 함.
				System.out.print("*");
			}
			System.out.println(); // 한줄 출력 후 한줄 띄어야 함.
		}
	}

}
