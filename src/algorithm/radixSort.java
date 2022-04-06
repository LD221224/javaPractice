package algorithm;

import java.util.Arrays;

/*
 * 1. 0~9 ������ Bucket(Queue �ڷᱸ����)�� �غ�
 * 2. ��� �����Ϳ� ���Ͽ� ���� ���� �ڸ����� �ش��ϴ� Bucket�� ���ʴ�� �����͸� �д�.
 * 3. 0���� ���ʴ�� ��Ŷ���� �����͸� �ٽ� �����´�.
 * 4. �ڸ����� �������� 2�� 3�� ������ �ݺ��Ѵ�.
*/
// ���� ���� �ڸ������� ���ϴ� ��� LSD(Least-Significant-Digit)
public class radixSort {
	static void countSort(int[] arr, int n, int exp) {
		int buffer[] = new int[n];
	    int i;
	    int count[] = new int[10];
	    
	    // exp�� �ڸ����� �ش��ϴ� count ����
	    for (i = 0; i < n; i++){
	        count[(arr[i] / exp) % 10]++;
	    }
	    // ������ ���ϱ�
	    for (i = 1; i < 10; i++) {
	        count[i] += count[i - 1];
	    }
	    // �Ϲ����� Counting sort ����
	    for (i = n - 1; i >= 0; i--) {
	        buffer[count[(arr[i]/exp) % 10] - 1] = arr[i];
	        count[(arr[i] / exp) % 10]--;
	    }
	    for (i = 0; i < n; i++){
	        arr[i] = buffer[i];
	    }
	}

	static void sort(int[] arr, int n) {
		//�ִ� �ڸ���ŭ ����
		int max=0;
		for(int i=0;i<n;i++) max=Math.max(max,arr[i]);
		
		//�ִ��� ������ ��, 0�� ������ ��� ���ڰ� i �Ʒ�
		for(int i=1; max/i>0;i*=10) {
			System.out.println(i+"�� �ڸ��� ���� �����մϴ�.");
			countSort(arr,n,i);
			System.out.println("���� ���");
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void main(String[] args) {
		int[] arr= {222,96,123,1,23, 5, 2, 17, 28};
		sort(arr, arr.length);
		System.out.println("���� ���� ���");
		System.out.println(Arrays.toString(arr));
	}

}
