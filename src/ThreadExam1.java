public class ThreadExam1 {
    public static void main(String[] args) {
        // MyThread�ν��Ͻ��� 2�� ����ϴ�. 
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        t1.start();
        t2.start();
        System.out.print("!!!!!");  
    }   
}