// ���ٽ��� �ٸ����� �͸� �޼ҵ��� �Ѵ�.
public class LambdaExam1 {  
    public static void main(String[] args) {
    	// ���ٽ� : ()->{...}
        new Thread(()->{
            for(int i = 0; i < 10; i++){
                System.out.println("hello");
            }
        }).start();
    }   
}