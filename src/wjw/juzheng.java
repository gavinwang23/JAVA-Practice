package wjw;

public class juzheng {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int t=0;
		for(int m=0;m<3;m++) {
			for(int n=0;n<3;n++) {
				a[m][n]=(int)(Math.random()*100);
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int b[]=new int[3];
		for(int k=0;k<3;k++) {
			b[k]=a[k][k];
			t=t+b[k];
		}
		System.out.println(t);
	}
}
