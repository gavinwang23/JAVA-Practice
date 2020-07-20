package wjw;

import java.util.Arrays;

public class Paixuchazhao {
public static void main(String args[]) {
	int a[]= {1,7,12,9,10,7,2,5,21,17};
	Arrays.sort(a);
	for(int x:a) {
		System.out.print(x+",");
	}
	int low=0;
	int high=a.length-1;
	boolean b=false;
	int t=0;
	while(low<high) {
		int mid=(low+high)/2;
		if(a[mid]<17) {
			low=mid+1;
			t=t+1;
		}
		if(a[mid]>17) {
			high=mid-1;
			t=t+1;
		}
		if(a[mid]==17) {
			t=t+1;
			System.out.print("找到17,在第"+(mid+1)+"位,循环"+t+"次");
			b=true;
			break;
		}
	}
	if(b==false) {
		System.out.print("未找到17,循环"+t+"次");
	}
}
}
