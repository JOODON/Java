public class interface1 {
    public static void main(String[] args) {
        Person personpark=new Person("동호!");
        Person studantPark=personpark;

        studantPark.JavaStady();
        studantPark.drinkBeer();
    }
}
interface Itme{
    public void JavaStady();
    public void drinkBeer();

}
class Person implements Itme{
    private String name;
    public Person(String name){
        this.name=name;
    }
    @Override
    public void JavaStady() {
        System.out.println(name+"공부 중");
    }

    public void drinkBeer(){
        System.out.println(name+"술마시는 중");
    }
}