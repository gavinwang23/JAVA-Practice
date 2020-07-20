package wjw;

public class Yanghui {
public static void main(String args[]) {
	for(int i=1;i<=6;i++) {
		for(int j=6-i;j>=0;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(k);
		}
		for(int l=i-1;l>=1;l--) {
			System.out.print(l);
		}
		System.out.println();
	}
}
}
