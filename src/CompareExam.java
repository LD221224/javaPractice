public class CompareExam {      
    public static void exec(Compare compare){
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k, m);
        System.out.println(value);
    }
    // �ڹٴ� �޼ҵ常 ���ڷ� �����Ϸ��� �ݵ�� ��ü�� ���� �����ؾ� �ߴ�. 
    // Java8�� ���ٽ��� ����鼭 ��ġ �Լ��� �����ϴ� ��ó�� �����ϰ� ������ ����� �� �ְ� �Ǵ�.
    // (�Ű��������)->{���๮}
    public static void main(String[] args) { 
    	// Compare �������̽��� �޾Ƶ��� ��, �ش� �������̽��� �̿��ϴ� exec�޼ҵ�
        exec((i, j)->{
            return i - j;
        }); }

}