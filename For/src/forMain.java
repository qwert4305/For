import java.util.ArrayList;
import java.util.List;

public class forMain {

	public static void main(String[] args) {

		// 2021.06.18
		// 1. value[0]+value[1] 합친 값 -> 다른 리스트 인덱스 0 에 넣음
		// value[2]+value[3] 합친 값 -> 다른 리스트 인덱스 1 에 넣음
		// value[4]+value[5] 합친 값 -> 다른 리스트 인덱스 2 에 넣음
		// ........[10] 까지

		String letter = "";
		String number = "";

		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
//		List<String> letterPlusNumber = new ArrayList<String>(); // 왜 안되는지???

		String letterPlusNumber = "";

		// 문자열 합치기
		for (int i = 0; i < letters.length; i++) {
			letterPlusNumber = letters[i] + numbers[i];
			System.out.println(letterPlusNumber);

		}
		
		// 인덱스 앞, 뒤 값 합쳐서 새로운 리스트에 0 부터 담기
		for(int i=0; i<5; i++) {
			String letterPlus = letters[i] + letters[i + 1];
			System.out.println(letterPlus);
			String[] all = new String[5];
			
		}
		// letterPlusNumber = letters[i] + letters[i + 1];
		// System.out.println(letterPlusNumber);

	}

}
