public class MusicBox { 
    //신나는 음악!!! 이란 메시지가 1초이하로 쉬면서 10번 반복출력
    public synchronized void playMusicA(){
        for(int i = 0; i < 10; i ++){
            System.out.println("신나는 음악!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicA

    //슬픈 음악!!!이란 메시지가 1초이하로 쉬면서 10번 반복출력
    public synchronized void playMusicB(){
        for(int i = 0; i < 10; i ++){
            System.out.println("슬픈 음악!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicB
    //카페 음악!!! 이란 메시지가 1초이하로 쉬면서 10번 반복출력
    public void playMusicC(){
        for(int i = 0; i < 10; i ++){
        	synchronized(this) {
        		System.out.println("카페 음악!!!");
        	}
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicC  
}