public class MusicBoxExam1 {

    public static void main(String[] args) {
        // MusicBox 인스턴스
        MusicBox box = new MusicBox();

        MusicPlayer kim = new MusicPlayer(1, box);
        MusicPlayer lee = new MusicPlayer(2, box);
        MusicPlayer kang = new MusicPlayer(3, box);

        // MusicPlayer쓰레드를 실행합니다. 
            kim.start();
            lee.start();
            kang.start();           
        }   
}