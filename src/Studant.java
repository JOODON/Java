//오브젝트 모든클래스의 최상위 클래스

import java.util.Objects;
public class Studant{
    String name;
    String number;
    int birth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studant)) return false;

        Studant studant = (Studant) o;

        if (birth != studant.birth) return false;
        if (name != null ? !name.equals(studant.name) : studant.name != null) return false;
        return number != null ? number.equals(studant.number) : studant.number == null;
    }

    @Override
    public String toString() {
        return "Studant{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birth=" + birth +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + birth;
        return result;
    }

    public static void main(String[] args) {
        Studant s1=new Studant();
        s1.name="주동호";
        s1.number="1234";
        s1.birth=1030;

        Studant s2=new Studant();
        s2.name="주동호";
        s2.number="1234";
        s2.birth=1030;

        if (s1.equals(s2)){
            System.out.println("S1==S2");
        }
        else {
            System.out.println("S1!=S2");
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);
        System.out.println(s1.toString());
    }
}