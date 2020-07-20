package wjw;

import java.util.Scanner;

class zhunbei{
String a[]= {"方块","梅花","黑桃","红桃"};
String b[]= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
int n=0;String[] c=new String[54]; static int t=0;
public void xipaifapai(){
	for(int i=0;i<13;i++) {
		for(int j=0;j<4;j++) {
			c[n]=a[j]+b[i];
			n=n+1;
		}
	}
	c[52]="小王";
	c[53]="大王";
	t=(int) (Math.random()*54);
	System.out.println("抽到了："+c[t]);
}
}
public class Poker3 extends zhunbei{
    static int x; static int y=0;
	public static void main(String[] args) {
	    Scanner fapai = new Scanner(System.in);
	    zhunbei z1=new zhunbei();
	    zhunbei z2=new zhunbei();
	    System.out.print("请输入玩家1姓名");
	    String aa=fapai.next();
	    z1.xipaifapai();
	    x=t;
	    System.out.print("请输入玩家2姓名");
	    String bb = fapai.next();
	    z2.xipaifapai();
	    y=t;
	    if(x>y) {
	    	System.out.println(aa+"获胜");
	    }
	    else if(x<y) {
	    	System.out.println(bb+"获胜");
	    }
	    else {
	    	System.out.println("平局");
	    }
	}
}
