package wjw;

public class fangzhen {
	public static void main(String[] args) {
		int n=((int) (Math.random()*3+1))*2+1;
		System.out.println("方阵宽度为:"+n);
		int a[][]=new int[n][n];
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=(int) (Math.random()*10);
			}
		}
		for(int k=0;k<n;k++) {
			sum=sum+a[k][k];
		}
		int t=sum-a[(n-1)/2][(n-1)/2];
		do {
			for(int m=0;m<n;m++) {
				for(int r=0;r<n;r++) {
					if(m+r==n-1&&m!=r&&m!=n-1&&r!=0) {
						do {
							a[m][r]=(int) (Math.random()*(t+1));
						}
						while(a[m][r]>=10);
						t=t-a[m][r];
					}
					else if(m==n-1&&r==0) {
						a[m][r]=t;
					}
				}
			}
		}
		while(a[n-1][0]>=10);
		for(int f=0;f<n;f++) {
			for(int g=0;g<n;g++) {
				System.out.print(a[f][g]+" ");;
			}
			System.out.println();
		}
		System.out.println("对角线和为："+sum);
	}
}
