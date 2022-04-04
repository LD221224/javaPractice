import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 
public class CharIOExam02 {
    public static void main(String[] args) {
    	//BufferedReader Ŭ������ ������ �ִ� readLine() �޼ҵ尡 ���پ� �а� ���ش�.
    	//readLine()�޼ҵ�� �о �� �� �̻� �о� ���� ������ ���� �� null�� �����Ѵ�.
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