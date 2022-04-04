// 람다식은 다른말로 익명 메소드라고도 한다.
public class LambdaExam1 {  
    public static void main(String[] args) {
    	// 람다식 : ()->{...}
        new Thread(()->{
            for(int i = 0; i < 10; i++){
                System.out.println("hello");
            }
        }).start();
    }   
}