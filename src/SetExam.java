import java.util.*;

//set�� �ߺ��� ������ ���� �ڷᱸ��
public class SetExam{
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        
        Iterator<String> iter = set.iterator();
        //iter�� �̿��ؼ� set�� ������ ����ϼ���.
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
        
    }
}