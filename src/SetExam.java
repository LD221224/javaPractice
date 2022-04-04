import java.util.*;

//set은 중복과 순서가 없는 자료구조
public class SetExam{
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        
        Iterator<String> iter = set.iterator();
        //iter를 이용해서 set의 내용을 출력하세요.
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
        
    }
}