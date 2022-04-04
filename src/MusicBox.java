public class MusicBox { 
    //�ų��� ����!!! �̶� �޽����� 1�����Ϸ� ���鼭 10�� �ݺ����
    public synchronized void playMusicA(){
        for(int i = 0; i < 10; i ++){
            System.out.println("�ų��� ����!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicA

    //���� ����!!!�̶� �޽����� 1�����Ϸ� ���鼭 10�� �ݺ����
    public synchronized void playMusicB(){
        for(int i = 0; i < 10; i ++){
            System.out.println("���� ����!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicB
    //ī�� ����!!! �̶� �޽����� 1�����Ϸ� ���鼭 10�� �ݺ����
    public void playMusicC(){
        for(int i = 0; i < 10; i ++){
        	synchronized(this) {
        		System.out.println("ī�� ����!!!");
        	}
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicC  
}