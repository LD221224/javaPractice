package algorithm;
import java.util.Arrays;
// 탐색 범위를 두 부분으로 분할하면서 찾는 방식
/*
 * 1. 우선 정렬을 해야 함
 * 2. left와 right로 mid 값 설정
 * 3. mid와 내가 구하고자 하는 값과 비교
 * 4. 구할 값이 mid보다 높으면 : left = mid+1 구할 값이 mid보다 낮으면 : right = mid - 1
 * 5. left > right가 될 때까지 계속 반복하기
*/
public class binarySearch {
	public void search(int[] arr, int M) { // arr 배열에서 M을 찾자
		Arrays.sort(arr); // 정렬
		int left = 0; // 시작
		int right = arr[arr.length - 1]; // 끝
		int count = 0;
		while (left <= right) {
			int mid = (left + right) / 2; // 시작과 끝의 중간값
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
				System.out.println(M + "찾기 : " + count + "번");
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
