import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//���Ϸ� ���� 512byte�� �о�鿩 ���Ͽ� 512byte�� �����ϴ� ���α׷�
public class ByteIOExam2 {
        public static void main(String[] args){     
            //�޼ҵ尡 ���۵� �ð��� ���ϱ� ����
            long startTime = System.currentTimeMillis();        
            FileInputStream fis = null; 
            FileOutputStream fos = null;        
            try {
                fis = new FileInputStream("src/ByteIOExam2.java");
                fos = new FileOutputStream("byte2.txt");

                int readCount = -1; 
                byte[] buffer = new byte[512];
                while((readCount = fis.read(buffer))!= -1){
                    fos.write(buffer,0,readCount);
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
        //�޼ҵ尡 �������� �ð��� ���ϱ� ����. 
        long endTime = System.currentTimeMillis();
        //�޼ҵ带 �����ϴµ� �ɸ� �ð��� ���� �� ����. 
        System.out.println(endTime-startTime); 
        }
    }