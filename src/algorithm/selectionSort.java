package algorithm;
import java.util.Arrays;
// 주어진 배열 중에 최소값을 찾습니다.
// 그 값을 맨 앞에 위치한 값과 교체합니다. (pass)
// 맨 처음 위치를 뺀 나머지 배열을 같은 방법으로 교체합니다.
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
	     * 1. 우선, 위치(index)를 선택해줍니다.
	     * 2. i+1번째 원소부터 선택한 위치(index)의 값과 비교를 시작합니다.
	     * 3. 오름차순이므로 현재 선택한 자리에 있는 값보다 순회하고 있는 값이 작다면, 위치(index)를 갱신해줍니다.
	     * 4. '2'번 반복문이 끝난 뒤에는 indexMin에 '1'번에서 선택한 위치(index)에 들어가야하는 값의 위치(index)를 갖고 있으므로 서로 교환(swap)해줍니다.
	     * */
	    System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		selectionSort ss = new selectionSort();
		int[] arr = {1, 54, 32, 75, 87, 3};
		ss.sort(arr);
	}
}
