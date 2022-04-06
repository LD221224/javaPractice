package algorithm;
// 완전 이진 트리를 기본으로 하는 힙(Heap) 자료구조를 기반으로한 정렬 방식
// 완전 이진 트리 : 삽입할 때 왼쪽부터 차례대로 추가하는 이진 트리
/*
 * 1. n개의 노드에 대한 완전 이진 트리를 구성한다. 이때 루트 노드부터 부모노드, 왼쪽 자식노드, 오른쪽 자식노드 순으로 구성한다.
 * 2. 최대 힙을 구성한다. 최대 힙이란 부모노드가 자식노드보다 큰 트리를 말하는데, 
 * 	  단말 노드를 자식노드로 가진 부모노드부터 구성하며 아래부터 루트까지 올라오며 순차적으로 만들어 갈 수 있다.
 * 3. 가장 큰 수(루트에 위치)를 가장 작은 수와 교환한다.
 * 4. 2와 3을 반복한다
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
