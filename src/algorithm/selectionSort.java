package algorithm;
import java.util.Arrays;
// �־��� �迭 �߿� �ּҰ��� ã���ϴ�.
// �� ���� �� �տ� ��ġ�� ���� ��ü�մϴ�. (pass)
// �� ó�� ��ġ�� �� ������ �迭�� ���� ������� ��ü�մϴ�.
public class selectionSort {
	void sort(int[] arr) {
	    int indexMin, temp;
	    for (int i = 0; i < arr.length-1; i++) {        // 1.
	        indexMin = i;
	        for (int j = i + 1; j < arr.length; j++) {  // 2.
	            if (arr[j] < arr[indexMin]) {           // 3.
	                indexMin = j;
	            }
	        }
	        // 4. swap(arr[indexMin], arr[i])
	        temp = arr[indexMin];
	        arr[indexMin] = arr[i];
	        arr[i] = temp;
	    }
	    /*
	     * 1. �켱, ��ġ(index)�� �������ݴϴ�.
	     * 2. i+1��° ���Һ��� ������ ��ġ(index)�� ���� �񱳸� �����մϴ�.
	     * 3. ���������̹Ƿ� ���� ������ �ڸ��� �ִ� ������ ��ȸ�ϰ� �ִ� ���� �۴ٸ�, ��ġ(index)�� �������ݴϴ�.
	     * 4. '2'�� �ݺ����� ���� �ڿ��� indexMin�� '1'������ ������ ��ġ(index)�� �����ϴ� ���� ��ġ(index)�� ���� �����Ƿ� ���� ��ȯ(swap)���ݴϴ�.
	     * */
	    System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		selectionSort ss = new selectionSort();
		int[] arr = {1, 54, 32, 75, 87, 3};
		ss.sort(arr);
	}
}
