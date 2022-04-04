import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//���Ϸ� ���� 1byte�� �о�鿩 ���Ͽ� 1byte�� �����ϴ� ���α׷��� �ۼ�
public class ByteIOExam1 {
        public static void main(String[] args){   
        	//���Ϸ� ���� �о���� ���� ��ü - FileInputStream
        	//���Ͽ� ���� �ְ� ���ִ� ��ü - FileOutputStream 
            FileInputStream fis = null; 
            FileOutputStream fos = null;        
            try {
                fis = new FileInputStream("src/ByteIOExam1.java");
                fos = new FileOutputStream("byte.txt");
                //read()�޼ҵ�� �о�� �����͸� int������ �����մϴ�. �о���� ���� ���ٸ� -1�� �����մϴ�. 
                int readData = -1; 
                while((readData = fis.read())!= -1){
                    fos.write(readData);
                }           
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally{
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }