import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) {
        MyHello hello = new MyHello();
        //MyHello�� hello�޼ҵ尡 @Count100������̼��� �����Ǿ� ���� ���, 
        //hello()�޼ҵ带 100�� ȣ���ϵ��� �մϴ�.
        try{
            Method method = hello.getClass().getDeclaredMethod("hello");
        if(method.isAnnotationPresent(Count100.class)){
                for(int i = 0; i < 100; i++){
                    hello.hello();
                }
            }else{
                hello.hello();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }       
    }
}