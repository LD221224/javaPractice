package algorithm;
// https://terms.naver.com/entry.naver?docId=2270444&cid=51173&categoryId=51173
// 인접한 것이 아닌 서로 먼 거리에 있는 요소를 교환하면서 속도를 줄일 수 있음
public class quickSort {
	void sort(int[] array, int left, int right) {
	    
	    if(left >= right) return;
	    
	    int pi = partition(array, left, right);
	    
	    sort(array, left, pi-1);
	    sort(array, pi+1, right);
	    
	}
	
	public static int partition(int[] array, int left, int right) {
	    int mid = (left + right) / 2;
	    swap(array, left, mid);
	 
	    int pivot = array[left];
	    int i = left, j = right;
	 
	    while (i < j) {
	        while (pivot < array[j]) {
	            j--;
	        }
	 
	        while (i < j && pivot >= array[i]) {
	            i++;
	        }
	        swap(array, i, j);
	    }
	    array[left] = array[i];
	    array[i] = pivot;
	    return i;
	}
	
	public static void swap(int[] array, int a, int b) {
	    int temp = array[b];
	    array[b] = array[a];
	    array[a] = temp;
	}
	
	private void solve() {
	    int[] array = { 80, 70, 60, 50, 40, 30, 20 };
	    sort(array, 0, array.length - 1);
	 
	    for (int v : array) {
	        System.out.println(v);
	    }
	}
	public static void main(String[] args) {
		quickSort qs = new quickSort();
		qs.solve();
	}
}
