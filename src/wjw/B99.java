package wjw;

public class B99 {
public static void main(String[] args) {
	for(int x=1;x<10;x++) {
		for(int y=1;y<=x;y++) {
			if(x*y<10)
			System.out.print(y+"x"+x+"="+x*y+"  ");
			else System.out.print(y+"x"+x+"="+x*y+" ");
		}
		System.out.println();
	}
}
}
