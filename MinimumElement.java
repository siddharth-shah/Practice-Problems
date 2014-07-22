public class MinimumElement {

	public static int findMin(int low, int high, int[] numArray) {
		
		if (high == low) {
			return low;
		} else {

			int mid = (high + low) / 2;
			int overAllMin = 0;
			int leftMin = 0;
			int rightMin = 0;
			if (numArray[high] < numArray[low]) {

				leftMin = findMin(low, mid, numArray);
				rightMin = findMin(mid + 1, high, numArray);
			} else {
				overAllMin = low;
			}

			if (numArray[leftMin] > numArray[rightMin])
				overAllMin = rightMin;
			if (numArray[rightMin] > numArray[leftMin])
				overAllMin = leftMin;

			return overAllMin;
		}
	}

	public static void main(String[] args) {
		int[] numArray = { 3, 4, 5, 6, 7, 8, 2 };
		int high = numArray.length - 1;
		int low = 0;
		int minimum = findMin(low, high, numArray);
		System.out.println(numArray[minimum]);
	}
}
