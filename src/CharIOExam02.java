import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 
public class CharIOExam02 {
    public static void main(String[] args) {
    	//BufferedReader 클래스가 가지고 있는 readLine() 메소드가 한줄씩 읽게 해준다.
    	//readLine()메소드는 읽어낼 때 더 이상 읽어 들일 내용이 없을 때 null을 리턴한다.
        BufferedReader br = null; 
        PrintWriter pw = null;
        try{        
            br = new BufferedReader(new FileReader("src/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            while((line = br.readLine())!= null){
                pw.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}