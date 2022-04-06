package algorithm;
import java.util.Arrays;
// 서로 인접한 두 원소의 대소를 비교하고, 
// 조건에 맞지 않다면 자리를 교환하며 정렬하는 알고리즘
public class bubbleSort {
	void sort(int[] arr) {
	    int temp = 0;
		for(int i = 0; i < arr.length; i++) {       // 1.
			for(int j= 1 ; j < arr.length-i; j++) { // 2.
				if(arr[j-1] > arr[j]) {             // 3.
	                // swap(arr[j-1], arr[j])
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		/*
		 * 1. 제외될 원소의 갯수를 의미합니다. 1회전이 끝난 후, 배열의 마지막 위치에는 가장 큰 원소가 위치하기 때문에 하나씩 증가시켜줍니다.
		 * 2. 원소를 비교할 index를 뽑을 반복문입니다. j는 현재 원소를 가리키고, j-1은 이전 원소를 가리키게 되므로, j는 1부터 시작하게 됩니다.
		 * 3. 현재 가르키고 있는 두 원소의 대소를 비교합니다. 해당 코드는 오름차순 정렬이므로 현재 원소보다 이전 원소가 더 크다면 이전 원소가 뒤로 가야하므로 서로 자리를 교환해줍니다.
		 * */
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		bubbleSort bs = new bubbleSort();
		int[] arr = {1, 54, 32, 75, 87, 3};
		bs.sort(arr);
	}
}
