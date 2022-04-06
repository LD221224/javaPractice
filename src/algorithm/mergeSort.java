package algorithm;
import java.util.Arrays;
// ū ������ ���� ���� ������ �ɰ��鼭 �ذ��س����� ���
// ��Ҹ� �ɰ� ��, �ٽ� �պ���Ű�鼭 �����س����� �������, �ɰ��� ����� �����İ� ����
// ������ : �켱 �ǹ��� ���� ����(partition) �� ������ �ɰ�(quickSort)
// �պ����� : ������ �ɰ� �� ���� ��ŭ �ɰ�(mergeSort) �� ����(merge)
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
