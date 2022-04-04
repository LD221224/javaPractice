import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class CharIOExam01 {
    public static void main(String[] args) {
    	//System.in - Ű���带 �ǹ� (InputStream )
    	//BufferedReader - ���پ� �Է� �ޱ����� Ŭ����
    	//BufferedReader Ŭ������ �����ڴ� InputStream�� �Է¹޴� �����ڰ� ����.
    	//System.in�� InputStream Ÿ���̹Ƿ� BufferedReader�� �����ڿ� �ٷ� �� �� �����Ƿ� InputStreamReader Ŭ������ �̿��ؾ���.
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Ű����� �Է¹��� ���ڿ��� �����ϱ� ���� line������ ����               
        String line = null;     
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //�ֿܼ� ��� 
        System.out.println(line);
    }
}