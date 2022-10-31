package onboarding;

import java.util.List;

public class Problem3 {
	static final List<Integer> CLAP_NUMBER_LIST = List.of(3, 6, 9);
	static final int BASE_OF_NUMERAL_SYSTEM = 10;

	public static int solution(int number) {
		return sumTotalClap(number);
	}

	private static int sumTotalClap(int number) {
		int totalCount = 0;
		for (int numberToCheck = 1; numberToCheck <= number; numberToCheck++) {
			totalCount += countClap(numberToCheck);
		}
		return totalCount;
	}

	private static int countClap(int numberToCheck) {
		int count = 0;
		while (numberToCheck != 0) {
			if (CLAP_NUMBER_LIST.contains(numberToCheck % BASE_OF_NUMERAL_SYSTEM)) {
				count += 1;
			}
			numberToCheck /= BASE_OF_NUMERAL_SYSTEM;
		}
		return count;
	}
}
