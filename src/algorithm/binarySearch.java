package algorithm;
import java.util.Arrays;
// Ž�� ������ �� �κ����� �����ϸ鼭 ã�� ���
/*
 * 1. �켱 ������ �ؾ� ��
 * 2. left�� right�� mid �� ����
 * 3. mid�� ���� ���ϰ��� �ϴ� ���� ��
 * 4. ���� ���� mid���� ������ : left = mid+1 ���� ���� mid���� ������ : right = mid - 1
 * 5. left > right�� �� ������ ��� �ݺ��ϱ�
*/
public class binarySearch {
	public void search(int[] arr, int M) { // arr �迭���� M�� ã��
		Arrays.sort(arr); // ����
		int left = 0; // ����
		int right = arr[arr.length - 1]; // ��
		int count = 0;
		while (left <= right) {
			int mid = (left + right) / 2; // ���۰� ���� �߰���
			System.out.println(left + "~" + right + ", " + mid);
			if (M > mid) {
				left = mid + 1;
				count++;
			}
			else if(M < mid) {
				right = mid - 1;
				count++;
			}
			else {
				System.out.println(M + "ã�� : " + count + "��");
				break;
			}
		}
	}
	public static void main(String[] args) {
		binarySearch bs = new binarySearch();
		int[] arr = new int[200];
		for(int i = 0; i < 200; i++) {
			arr[i] = i + 1;
		}
		bs.search(arr, 123);
	}
}
