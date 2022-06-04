public class InterFace2 {
    public static void main(String[] args) {
    D a=new D("주동호");
    A b=a;
    b.Programming("java");
    B c=a;
    c.teach("C++");
    C d=a;
    d.massage();
    }
}
interface A{
    public void Programming(String lang);
}
interface B{
    public void teach(String subject);
}
interface C{
    public void massage();
}
class D implements A,B,C{
    private String name;
    public D(String name){
        this.name=name;
    }
    public void Programming(String lang){
        System.out.printf("%s->%s는 프로그래밍중 \n",name,lang);
    }
    public void teach(String subject){
        System.out.printf("%s->%s는 가르키는중 \n",name,subject);
    }
    public void massage(){
        System.out.printf("%s는 마사지중 \n",name);
    }

}
