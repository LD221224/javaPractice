import java.util.*;

//list�� �������� �ߺ��� ���� �� �ְ�, ������ �ִ�.
public class ListExam{
    public List<String> addArray(String[]arr1, String[]arr2){
        List<String> list = new ArrayList<String>();
        
        for(String str : arr1){
            System.out.println(str);   
            list.add(str);
        }
        
        for(String str : arr2){
            System.out.println(str);
            list.add(str);
        }
        
        
        return list;
    }
    
    public static void main(String[] args){
    	ListExam listEx = new ListExam();
    	String[] arr1 = {"a", "b", "c"};
    	String[] arr2 = {"c", "d"};
    	listEx.addArray(arr1, arr2);
    }
}