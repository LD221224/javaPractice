package algorithm;
/*
 * 1. 가장 큰 데이터와 가장 작은 데이터의 범위를 모두 담을 수 있는 리스트(count)를 K 개수만큼 생성하고, 0으로 초기화 한다.
 * -> 메모리 낭비
 * 2. 정렬된 배열(output)를 초기화한다.
 * 3. 데이터를 하나씩 확인하며 데이터의 값과 동일한 인덱스의 데이터를 1씩 증가시킨다.
 * 4. count의 값을 이전 요소들의 누적 합으로 다시 할당한다.
 * 5. count를 기준으로 새로운 배열에 재배치한다.
*/

import java.util.Arrays;

public class countSort {
	void sort(int[] arr, int k) {
		int[] arr_b = new int[k];
		int[] arr_c = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			arr_b[arr[i]]++;
		for (int i = 1; i < arr_b.length; i++)
			arr_b[i] += arr_b[i - 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr_b[arr[i]]--;
			arr_c[arr_b[arr[i]]] = arr[i];
		}
		System.out.println(Arrays.toString(arr_c));
	}
	public static void main(String[] args) {
		countSort cs = new countSort();
		int[] arr = {1, 222, 2, 123, 23, 5, 96, 17, 28};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		cs.sort(arr, max + 1);
	}
}
