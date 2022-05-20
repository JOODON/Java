public class CLASS {
    public static void main(String[] args) {
        //객체 생성를 생성하자마 필드를 지정
        Shop s1 = new Shop("주",100,30);
        Shop s2 = new Shop("동",100,30);

        System.out.println(s1.print(s2));

    }
}
class Shop {
    //필드
    String name;
    int hp;
    int mp;
    //생성자
    Shop(String _name,int _hp,int _mp){
        name=_name;
        hp=_hp;
        mp=_mp;
    }
    //메소드
    String print(Shop E){//앞에는 그냥 우리가 만들어준 클래스를 쓰고 그 뒤에는 변수?를 입력
        return String.format("%s의 펀치 HP:%d MP:%d",E.name,E.hp,E.mp);
    }
}
//클래스는 사용자가 정의한 타입 double String int처럼 우리가 만들어준 타입이라고 한다.

