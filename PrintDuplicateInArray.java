package week1.day2.assignments;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		int length = arr.length;
		int k = 0;
		for (int i = 0; i < length; i++) {

			int count = 0;
			int l = arr[i];
			i++;
			for (int j = i; j < length - 1; j++) {
				k = arr[j];

				if (l == k) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(l);
			}
		}

	}

}
