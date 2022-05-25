public class Main {
    public static void main(String[] args) {
        Bank b1=new Bank(5000);
        user.a(b1,7000);
        user.check(b1);
    }
}

class Bank{
    private int money;
        public Bank(int money){
        this.money=money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
class user{
    public static void check(Bank bank){
        System.out.printf("현재 잔액은:%d\n",bank.getMoney());
    }
    public static void a(Bank bank,int b){
        int c=bank.getMoney();
        bank.setMoney(c+b);
    }
}

//우리가 계좌가 있어 근데 이 계좌를 모든 사람 마음대로 바꿀수는 없잖아

//우리가 사용 할수 있게끔 만들어주면댐