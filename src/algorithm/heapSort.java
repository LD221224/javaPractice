package algorithm;
// ���� ���� Ʈ���� �⺻���� �ϴ� ��(Heap) �ڷᱸ���� ��������� ���� ���
// ���� ���� Ʈ�� : ������ �� ���ʺ��� ���ʴ�� �߰��ϴ� ���� Ʈ��
/*
 * 1. n���� ��忡 ���� ���� ���� Ʈ���� �����Ѵ�. �̶� ��Ʈ ������ �θ���, ���� �ڽĳ��, ������ �ڽĳ�� ������ �����Ѵ�.
 * 2. �ִ� ���� �����Ѵ�. �ִ� ���̶� �θ��尡 �ڽĳ�庸�� ū Ʈ���� ���ϴµ�, 
 * 	  �ܸ� ��带 �ڽĳ��� ���� �θ������ �����ϸ� �Ʒ����� ��Ʈ���� �ö���� ���������� ����� �� �� �ִ�.
 * 3. ���� ū ��(��Ʈ�� ��ġ)�� ���� ���� ���� ��ȯ�Ѵ�.
 * 4. 2�� 3�� �ݺ��Ѵ�
*/
public class heapSort {
	public static void main(String[] args) {
		heapSort hs = new heapSort();
		hs.solve();
	}
	private void solve() {
	    int[] array = { 230, 10, 60, 550, 40, 220, 20 };
	 
	    sort(array);
	 
	    for (int v : array) {
	        System.out.println(v);
	    }
	}
	 
	public static void heapify(int array[], int n, int i) {
	    int p = i;
	    int l = i * 2 + 1;
	    int r = i * 2 + 2;
	 
	    if (l < n && array[p] < array[l]) {
	        p = l;
	    }
	 
	    if (r < n && array[p] < array[r]) {
	        p = r;
	    }
	 
	    if (i != p) {
	        swap(array, p, i);
	        heapify(array, n, p);
	    }
	}
	 
	public static void sort(int[] array) {
	    int n = array.length;
	 
	    // init, max heap
	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(array, n, i);
	    }
	 
	    // for extract max element from heap
	    for (int i = n - 1; i > 0; i--) {
	        swap(array, 0, i);
	        heapify(array, i, 0);
	    }
	}
	 
	public static void swap(int[] array, int a, int b) {
	    int temp = array[a];
	    array[a] = array[b];
	    array[b] = temp;
	}
}
