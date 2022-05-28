import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
    ArrayList<Book> list=new ArrayList<Book>();
    Book onepice=new Book("원피스",4500);
    Book naguto=new Book("나루토",2500);
    list.add(onepice);
    list.add(naguto);
    for (Book e:list){
        System.out.println(e);
    }
}
}
class Book{
    private String name;
    private int price;

    Book(String name, int price){
        this.name=name;
        this.price=price;
    }
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
