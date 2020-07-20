package wjw;

import java.util.ArrayList;

public class ttt1 {
	public static void main(String[] args) {
		int i=2;
		int z=0;
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(1);
		while(z<2178308) {
			int x=(int) a.get(i-2);
			int y=(int) a.get(i-1);
			z=x+y;
			a.add(z);
			i++;
		}
		for(int j=0;j<20;j++) {
			int c=(int) a.get(j);
			System.out.println(c);
		}
		for(int k=0;k<a.size();k++) {
			int d=(int) a.get(k);
			if(d==2178308) {
				System.out.println("在第"+(k+1)+"位");
				break;
			}
			else if(d>2178308) {
				System.out.println("没找到");
			}
		}
	}
}
