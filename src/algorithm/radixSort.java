package algorithm;

import java.util.Arrays;

/*
 * 1. 0~9 까지의 Bucket(Queue 자료구조의)을 준비
 * 2. 모든 데이터에 대하여 가장 낮은 자리수에 해당하는 Bucket에 차례대로 데이터를 둔다.
 * 3. 0부터 차례대로 버킷에서 데이터를 다시 가져온다.
 * 4. 자리수를 높여가며 2번 3번 과정을 반복한다.
*/
// 가장 작은 자리수부터 비교하는 방법 LSD(Least-Significant-Digit)
public class radixSort {
	static void countSort(int[] arr, int n, int exp) {
		int buffer[] = new int[n];
	    int i;
	    int count[] = new int[10];
	    
	    // exp의 자릿수에 해당하는 count 증가
	    for (i = 0; i < n; i++){
	        count[(arr[i] / exp) % 10]++;
	    }
	    // 누적합 구하기
	    for (i = 1; i < 10; i++) {
	        count[i] += count[i - 1];
	    }
	    // 일반적인 Counting sort 과정
	    for (i = n - 1; i >= 0; i--) {
	        buffer[count[(arr[i]/exp) % 10] - 1] = arr[i];
	        count[(arr[i] / exp) % 10]--;
	    }
	    for (i = 0; i < n; i++){
	        arr[i] = buffer[i];
	    }
	}

	static void sort(int[] arr, int n) {
		//최댓값 자리만큼 돌기
		int max=0;
		for(int i=0;i<n;i++) max=Math.max(max,arr[i]);
		
		//최댓값을 나눴을 때, 0이 나오면 모든 숫자가 i 아래
		for(int i=1; max/i>0;i*=10) {
			System.out.println(i+"의 자리에 대해 정렬합니다.");
			countSort(arr,n,i);
			System.out.println("정렬 결과");
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void main(String[] args) {
		int[] arr= {222,96,123,1,23, 5, 2, 17, 28};
		sort(arr, arr.length);
		System.out.println("최종 정렬 결과");
		System.out.println(Arrays.toString(arr));
	}

}
