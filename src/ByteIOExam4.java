    import java.io.DataInputStream;
    import java.io.FileInputStream;

    public class ByteIOExam4 {

        public static void main(String[] args) {
            try(
                    DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
            ){
            	//readInt() -정수를 읽어들이는 메소드
            	//readBoolean() - boolean 값을 읽어들이는 메소드
            	//readDouble() - double 값을 읽어들이는 메소드
                int i = in.readInt();          
                boolean b = in.readBoolean();          
                double d = in.readDouble();

                System.out.println(i);
                System.out.println(b);
                System.out.println(d);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }