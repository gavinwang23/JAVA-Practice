package wjw;

import java.util.Scanner;

class jiancha {
	public void xxx(int age) {
		if(age>=22) {
			System.out.println("交2000");
		}
		else if(age>=18 && age<22) {
			System.out.println("交1000");
		}
		else if(age<18) {
			System.out.println("未成年");
		}
	}
}
public class jiaobaoxian{
	public static void main(String[] args) {
		jiancha j=new jiancha();
		Scanner s=new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age=s.nextInt();
		j.xxx(age);
	}
}
