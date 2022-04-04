    import java.io.DataInputStream;
    import java.io.FileInputStream;

    public class ByteIOExam4 {

        public static void main(String[] args) {
            try(
                    DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
            ){
            	//readInt() -������ �о���̴� �޼ҵ�
            	//readBoolean() - boolean ���� �о���̴� �޼ҵ�
            	//readDouble() - double ���� �о���̴� �޼ҵ�
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