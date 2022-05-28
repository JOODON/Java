import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
    ArrayList<String> names=new ArrayList<String>();
    names.add("주동호");
    names.add("이선영");
    names.add("이건 그냥");
    for(String e:names){
        System.out.println(e);
    }
    }
}
