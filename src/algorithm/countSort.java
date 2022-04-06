package algorithm;
/*
 * 1. ���� ū �����Ϳ� ���� ���� �������� ������ ��� ���� �� �ִ� ����Ʈ(count)�� K ������ŭ �����ϰ�, 0���� �ʱ�ȭ �Ѵ�.
 * -> �޸� ����
 * 2. ���ĵ� �迭(output)�� �ʱ�ȭ�Ѵ�.
 * 3. �����͸� �ϳ��� Ȯ���ϸ� �������� ���� ������ �ε����� �����͸� 1�� ������Ų��.
 * 4. count�� ���� ���� ��ҵ��� ���� ������ �ٽ� �Ҵ��Ѵ�.
 * 5. count�� �������� ���ο� �迭�� ���ġ�Ѵ�.
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
