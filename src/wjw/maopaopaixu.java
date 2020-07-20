package wjw;

public class maopaopaixu {
public static void main(String[] args) {
	int a[]= {7,3,5,4,9};
	for(int i=1;i<5;i++) {
		for(int j=0;j<5-i;j++) {
			if(a[j]>a[j+1]) {
				int t=a[j];a[j]=a[j+1];a[j+1]=t;
			}	
		}
	}
		for(int x=0;x<5;x++) {
			System.out.print(a[x]+",");
		}
}
}
