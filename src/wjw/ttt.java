package wjw;

public class ttt {
	public static void main(String[] args) {
		int l=2;
		int n[]=new int[100];
		n[0]=1;
		n[1]=1;
		for(int i=2;i<20;i++) {
			n[i]=n[i-2]+n[i-1];
		}
		for(int j=0;j<20;j++) {
			System.out.println(n[j]);
		}
		do{
			n[l]=n[l-2]+n[l-1];
			if(n[l]==2178308) {
				System.out.println("在第"+(l+1)+"位");
				break;
			}
			else if(n[l]>2178308) {
				System.out.println("没找到");
				break;
			}
			l++;
		}
		while(l>0);
	}
}
