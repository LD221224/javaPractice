package algorithm;
import java.util.Arrays;
// ������ 2��° ��ġ(index)�� ���� temp�� �����մϴ�.
// temp�� ������ �ִ� ���ҵ�� ���ϸ� �����س����ϴ�.
// '1'������ ���ư� ���� ��ġ(index)�� ���� temp�� �����ϰ�, �ݺ��մϴ�.
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
	    * 1. ù ��° ���� ��(����)���� � ���ҵ� ���� ���� �ʱ� ������, �� ��° ��ġ(index)���� Ž���� �����մϴ�. temp�� �ӽ÷� �ش� ��ġ(index) ���� �����ϰ�, prev���� �ش� ��ġ(index)�� ���� ��ġ(index)�� �����մϴ�.
	    * 2. ���� ��ġ(index)�� ����Ű�� prev�� ������ ���� �ʰ�, ���� ��ġ(index)�� ���� '1'������ ������ ������ ũ�ٸ�, ���� ���� ��ȯ���ְ� prev�� �� ���� ��ġ(index)�� ����Ű���� �մϴ�.
		* 3. '2'������ �ݺ����� ������ �� ��, prev���� ���� temp ������ ���� ���� �� ���� ū ���� ��ġ(index) �� ����Ű�� �˴ϴ�. ����, (prev+1)�� temp ���� �������ݴϴ�.
		*/
		   System.out.println(Arrays.toString(arr));
		}
	public static void main(String[] args) {
		insertSort is = new insertSort();
		int[] arr = {12, 54, 32, 2, 7, 3};
		is.sort(arr);
	}
}
