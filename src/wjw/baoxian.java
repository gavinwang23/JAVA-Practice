package wjw;

import java.util.Calendar;
import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String Message){
        super(Message);
	}
}

class Driver{
	public int year;
	Calendar t=Calendar.getInstance();
	int y=(int) (t.get(Calendar.YEAR));
	public Driver(int year) throws AgeException{
		if(y-year>=22) {
			System.out.println("交1000");
		}
		else if(y-year<22){
			if(2018-year>=18) {
				System.out.println("交2000");
			}
			else if(y-year<18) {
				throw new AgeException("未成年！");
			}
		}
	}
}

public class baoxian {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入出生年份");
		int a=s.nextInt();
		Driver d;
		try{
	        d=new Driver(a);
		}
		catch(AgeException e){
	            System.out.println("非法，原因："+e.getMessage());
	    }
	}
}
