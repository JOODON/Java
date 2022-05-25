public class class1 {
    public static void main(String[] args) {
        Player a=new Player("팽도리",30);
        Player b=new Player("팽태자",20);
        a.skill(b);
    }
}
class Player{
    String name;
    int hp;
    Player(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    void skill(Player s){

        s.hp-=10;
        System.out.printf("[%s]의 스킬\n",name);
        System.out.printf("%s의 남은[%d]의 HP \n",s.name,s.hp);

    }
}
