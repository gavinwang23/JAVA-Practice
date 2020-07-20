package wjw;

import java.util.*;

public class fangzhen3 {
	public static void main(String[] args) {
		System.out.println("方阵宽度");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		int sum=n*(n*n+1)/2;
		a[0][(n-1)/2]=1;
		int i=0;int j=(n-1)/2;
		for(int x=2;x<=n*n;x++) {
			   int i1=i--; 
			   int j1=j--; 
			   if(i<0)
			   {
			      i=n-1;
			   }
			   if(j<0){
			      j=n-1;  
			   }
			   
			   if(a[i][j]!=0){
			      i=i1+1;
			      j=j1;
			   }
			   if(a[i][j]==0){
			      a[i][j]=x;
			   } 
		}
		
		for(int k=0;k<n;k++) {
			for(int l=0;l<n;l++) {
				System.out.printf("%-5s",a[k][l]);
			}
			System.out.println();
		}
	}
}

