import java.io.DataOutputStream;
import java.io.FileOutputStream;    
public class ByteIOExam3 {    
    public static void main(String[] args) {
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        ){
        	//wirteInt() - 정수값으로 저장
        	//wirteBoolean() - boolean값으로 저장
        	//writeDouble() - double 값으로 저장
            out.writeInt(100);
            out.writeBoolean(true);
            out.writeDouble(50.5);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }   
}