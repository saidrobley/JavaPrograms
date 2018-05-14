public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		System.out.println(binarySearch(5, arr));
	}

	
	public static int binarySearch(int key, int[] array){
		int low = 0;
		int high = array.length-1;
		while( high >= low){
			int mid = (high + low)/2;
			if(key == array[mid]){
				return mid;
			} else if (key < array[mid]){
				high = mid -1;
			} else if (key > array[mid]){
				low = mid + 1;
			}
			
		}
		return -1;
	}
	
	
}
