import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//파일로 부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램을 작성
public class ByteIOExam1 {
        public static void main(String[] args){   
        	//파일로 부터 읽어오기 위한 객체 - FileInputStream
        	//파일에 쓸수 있게 해주는 객체 - FileOutputStream 
            FileInputStream fis = null; 
            FileOutputStream fos = null;        
            try {
                fis = new FileInputStream("src/ByteIOExam1.java");
                fos = new FileOutputStream("byte.txt");
                //read()메소드는 읽어올 데이터를 int형으로 리턴합니다. 읽어들일 것이 없다면 -1을 리턴합니다. 
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