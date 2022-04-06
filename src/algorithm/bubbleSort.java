package algorithm;
import java.util.Arrays;
// ���� ������ �� ������ ��Ҹ� ���ϰ�, 
// ���ǿ� ���� �ʴٸ� �ڸ��� ��ȯ�ϸ� �����ϴ� �˰���
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
		 * 1. ���ܵ� ������ ������ �ǹ��մϴ�. 1ȸ���� ���� ��, �迭�� ������ ��ġ���� ���� ū ���Ұ� ��ġ�ϱ� ������ �ϳ��� ���������ݴϴ�.
		 * 2. ���Ҹ� ���� index�� ���� �ݺ����Դϴ�. j�� ���� ���Ҹ� ����Ű��, j-1�� ���� ���Ҹ� ����Ű�� �ǹǷ�, j�� 1���� �����ϰ� �˴ϴ�.
		 * 3. ���� ����Ű�� �ִ� �� ������ ��Ҹ� ���մϴ�. �ش� �ڵ�� �������� �����̹Ƿ� ���� ���Һ��� ���� ���Ұ� �� ũ�ٸ� ���� ���Ұ� �ڷ� �����ϹǷ� ���� �ڸ��� ��ȯ���ݴϴ�.
		 * */
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		bubbleSort bs = new bubbleSort();
		int[] arr = {1, 54, 32, 75, 87, 3};
		bs.sort(arr);
	}
}
