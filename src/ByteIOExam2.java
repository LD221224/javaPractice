import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//파일로 부터 512byte씩 읽어들여 파일에 512byte씩 저장하는 프로그램
public class ByteIOExam2 {
        public static void main(String[] args){     
            //메소드가 시작된 시간을 구하기 위함
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
        //메소드가 끝났을때 시간을 구하기 위함. 
        long endTime = System.currentTimeMillis();
        //메소드를 수행하는데 걸린 시간을 구할 수 있음. 
        System.out.println(endTime-startTime); 
        }
    }