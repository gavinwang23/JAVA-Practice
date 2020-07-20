package wjw;

import java.util.*;

public class fangzhen2 {
	public static void main(String[] args) {
		System.out.println("方阵宽度");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		int sum=n*(n*n+1)/2;
		a[0][n/2]=1;
		a[n-1][n/2]=n*n;
		int i=0;int j=n/2;
		for(int x=2;x<n*n;x++) {
			   int lasti=i--; 
			   int lastj=j++; 
			   if(lasti==0&&!(lastj==n-1))
			   {
			      i=n-1;
			   }
			   if(lastj==n-1&&!(lasti==0)){
			      j=0;  
			   }
			   if(lasti==0&&lastj==n-1){
			      i=i+2;
			      j--;
			   }
			   if((a[i][j]!=0)){
			      i=i+2;
			      j--;
			   }
			   if(a[i][j]==0){
			      a[i][j]=x;
			   } 
		}
		for(int k=0;k<n;k++) {
			for(int l=0;l<n;l++) {
				System.out.print(" "+a[k][l]);
			}
			System.out.println();
		}
	}
}
