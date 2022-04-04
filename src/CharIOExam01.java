import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class CharIOExam01 {
    public static void main(String[] args) {
    	//System.in - 키보드를 의미 (InputStream )
    	//BufferedReader - 한줄씩 입력 받기위한 클래스
    	//BufferedReader 클래스의 생성자는 InputStream을 입력받는 생성자가 없다.
    	//System.in은 InputStream 타입이므로 BufferedReader의 생성자에 바로 들어갈 수 없으므로 InputStreamReader 클래스를 이용해야함.
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //키보드로 입력받은 문자열을 저장하기 위해 line변수를 선언               
        String line = null;     
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //콘솔에 출력 
        System.out.println(line);
    }
}