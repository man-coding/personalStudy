package homeStudy;

import java.util.*;

public class solution {

	public long solution(long n) {
//		long answer = 0;
//
//		String str = String.valueOf(n);
//
//		List<Integer> intArr = new ArrayList<>();
//
//		for (int i = 0; i < str.length(); i++) {
//			intArr.add(Integer.parseInt(str.substring(i, i + 1)));
//		}
//		intArr.sort(Comparator.reverseOrder());
//
//		String str2 = "";
//		for (int i = 0; i < intArr.size(); i++) {
//			str2 += intArr.get(i).toString();
//		}
//		answer += (long) Integer.parseInt(str2);
//		return answer;
		
		long answer = 0;
		String str = String.valueOf(n);
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		StringBuilder sb = new StringBuilder(new String(charArr, 0, charArr.length));
		
		String str2 = sb.reverse().toString();
		answer = Long.parseLong(str2);
		return answer;
		
	}

}
