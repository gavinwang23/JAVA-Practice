package wjw;

interface CanFly {
    public void fly();
    String a="飞机飞";
    String b="小鸟飞";
}
class Feiji implements CanFly {
    public void fly() {
        System.out.println(a);
    }
}
class Niao implements CanFly {
    public void fly() {
        System.out.println(b);
    }
}
public class ceshi {
    public void makeFly(CanFly f,CanFly n){
         f.fly();
         n.fly();
    }  
    public static void main(String[] args) {
        ceshi c=new ceshi();
        CanFly f=new Feiji();
        CanFly n=new Niao();
        c.makeFly(f,n);
    }
}
