package algorithm;
import java.util.Arrays;
// 정렬은 2번째 위치(index)의 값을 temp에 저장합니다.
// temp와 이전에 있는 원소들과 비교하며 삽입해나갑니다.
// '1'번으로 돌아가 다음 위치(index)의 값을 temp에 저장하고, 반복합니다.
public class insertSort {
	void sort(int[] arr) {
	   for(int index = 1 ; index < arr.length ; index++){ // 1.
		      int temp = arr[index];
		      int prev = index - 1;
		      while( (prev >= 0) && (arr[prev] > temp) ) {    // 2.
		         arr[prev+1] = arr[prev];
		         prev--;
		      }
		      arr[prev + 1] = temp;                           // 3.
		   }
	   /*
	    * 1. 첫 번째 원소 앞(왼쪽)에는 어떤 원소도 갖고 있지 않기 때문에, 두 번째 위치(index)부터 탐색을 시작합니다. temp에 임시로 해당 위치(index) 값을 저장하고, prev에는 해당 위치(index)의 이전 위치(index)를 저장합니다.
	    * 2. 이전 위치(index)를 가리키는 prev가 음수가 되지 않고, 이전 위치(index)의 값이 '1'번에서 선택한 값보다 크다면, 서로 값을 교환해주고 prev를 더 이전 위치(index)를 가리키도록 합니다.
		* 3. '2'번에서 반복문이 끝나고 난 뒤, prev에는 현재 temp 값보다 작은 값들 중 제일 큰 값의 위치(index) 를 가리키게 됩니다. 따라서, (prev+1)에 temp 값을 삽입해줍니다.
		*/
		   System.out.println(Arrays.toString(arr));
		}
	public static void main(String[] args) {
		insertSort is = new insertSort();
		int[] arr = {12, 54, 32, 2, 7, 3};
		is.sort(arr);
	}
}
