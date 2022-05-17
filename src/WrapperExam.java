public class WrapperExam {
    public static void main(String[] args) {
        int i=5;
        Integer i2=new Integer(5);
        //객채화 시키려면 이런식으로 사용했는데 아래 코드로도 사용가능
        Integer i3=5;

        int i4=i3.intValue();
        //객채화 풀려면 이런식으로 사용했는데 아래 코드로도 사용가능
        int i5=i3;
    }
}
