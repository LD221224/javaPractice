package algorithm;
import java.util.Arrays;
// 큰 문제를 작은 문제 단위로 쪼개면서 해결해나가는 방식
// 요소를 쪼갠 후, 다시 합병시키면서 정렬해나가는 방식으로, 쪼개는 방식은 퀵정렬과 유사
// 퀵정렬 : 우선 피벗을 통해 정렬(partition) → 영역을 쪼갬(quickSort)
// 합병정렬 : 영역을 쪼갤 수 있을 만큼 쪼갬(mergeSort) → 정렬(merge)
public class mergeSort {
	void sort (int[] array, int left, int right) {
	    if(left < right) {
	        int mid = (left + right) / 2;
	        
	        sort(array, left, mid);
	        sort(array, mid+1, right);
	        merge(array, left, mid, right);
	    }	    
	}
	
	public static void merge(int[] array, int left, int mid, int right) {
	    int[] L = Arrays.copyOfRange(array, left, mid + 1);
	    int[] R = Arrays.copyOfRange(array, mid + 1, right + 1);
	    
	    int i = 0, j = 0, k = left;
	    int ll = L.length, rl = R.length;
	    
	    while(i < ll && j < rl) {
	        if(L[i] <= R[j]) {
	            array[k] = L[i++];
	        }
	        else {
	            array[k] = R[j++];
	        }
	        k++;
	    }
	    
	    // remain
	    while(i < ll) {
	        array[k++] = L[i++];
	    }
	    while(j < rl) {
	        array[k++] = R[j++];
	    }
	}
	
	private void solve() {
	    int[] array = { 230, 10, 60, 550, 40, 220, 20 };
	 
	    sort(array, 0, array.length - 1);
	 
	    for (int v : array) {
	        System.out.println(v);
	    }
	}
	
	public static void main(String[] args) {
		mergeSort ms = new mergeSort();
		ms.solve();
	}

}
