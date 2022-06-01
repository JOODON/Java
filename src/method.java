public class method {
    public static void main(String[] args) {
        print();
        System.out.println(Str("이에용"));
        System.out.println(Integer(5));
    }
    public static void print(){
        System.out.println("안녕 이건 출력 메소드");
    }
    public static String Str(String text){
        return "난 스트링"+text;
    }
    public static int Integer(int i){
        return 1000+i;
    }
}
