public class Classs{
    public static void main(String[] args) {
        abc player=new abc("위자드",100);
        User2 player2=new User2("해리포터",100,30);
        System.out.println(player.print());
        System.out.println(player2.print());
    }
}
class abc{
    protected Object hp;
    protected Object name;

    public abc(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    public String print(){
        return String.format("%s (Hp%d),",this.name,this.hp);
    }
}
class User2 extends abc{
    private int mp;

    public User2(String name, int hp,int mp) {
        super(name, hp);//기존에 있던걸 가져옴
        this.mp=mp;
    }
    public String print(){
        return String.format("%s (HP:%d MP:%d)",this.name,this.hp,this.mp);
    }
}