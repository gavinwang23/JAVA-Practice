package wjw;

import java.util.Scanner;

public class tiren {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入人数：");
		int people=scan.nextInt();
		String a[]=new String[people];
		for(int p=0;p<people;p++) {
			a[p]="玩家"+(p+1);
		}
		//String a[]= {"a","b","c","d","e","f","g","h","i","j","k"};
		int end=a.length-1;
		int x=0;
		int m=(a.length)/3+1;
		int c[] = new int[m];
		int b;
		int k=0;
		while(end>0) {
			b=0;
			for(x=0;x<=end;x++) {
				if((k+x+1)%3==0) {
					c[b]=x;
					b++;
				}
			}
			for(int i=0;i<b;i++) {
				int t=c[i]-i;
				for(int f=t;f<end-i;f++) {
				    a[f]=a[f+1];
				}
			}
			k=(end+1+k)%3;
			end=end-b;
		}
		System.out.print("结果是:"+a[0]);
	}
}
