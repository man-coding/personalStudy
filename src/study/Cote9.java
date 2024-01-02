package study;

import java.util.ArrayList;

class Solution {
	public ArrayList<Integer> solution(int[] num_list) {

		ArrayList<Integer> answer = new ArrayList<Integer>(); // answer 리스트 생성

		for (int i = 1; i <= num_list.length; i++) { // num_list 길이만큼 반복, '<=' 해줘야 arr[0] 까지 마저 넣을 수 있음.
			answer.add(num_list[num_list.length - i]); // answer 리스트에 num_list 마지막 값부터 num_list[0] 까지 차례로 넣는다.
		}
		return answer; // answer 배열 리턴
	}

}

public class Cote9 {

}
