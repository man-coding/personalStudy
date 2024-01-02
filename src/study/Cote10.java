package study;

public class Cote10 {

	class Solution {
		public int[] solution(int money) {

			int price = 5500;
			int cup = 0;
			int remain = money;

			if (remain < price) {
				int[] answer = { cup, remain };
			} else {
				while (remain >= price) {
					cup++;
					remain = money - price * cup;

				}

			}
			int[] answer = { cup, remain };
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
