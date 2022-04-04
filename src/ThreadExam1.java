public class ThreadExam1 {
    public static void main(String[] args) {
        // MyThread인스턴스를 2개 만듭니다. 
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        t1.start();
        t2.start();
        System.out.print("!!!!!");  
    }   
}