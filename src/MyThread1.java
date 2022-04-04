//쓰레드 : 동시에 여러가지 작업을 동시에 수행할 수 있게하는것
public class MyThread1 extends Thread {
    String str;
    public MyThread1(String str){
        this.str = str;
    }

    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.print(str);
            try {
                //컴퓨터가 너무 빠르기 때문에 수행결과를 잘 확인 할 수 없어서 Thread.sleep() 메서드를 이용해서 조금씩 
                //쉬었다가 출력할 수 있게한다. 
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    } 
}