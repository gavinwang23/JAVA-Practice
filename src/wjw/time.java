package wjw;

import java.util.Scanner;

public class time {
     public static class MyDate {
	        private int year;
	        private int month;
	        private int day;
     }


	    public static void main(String[] args) {

	        int year, month, day;
	        int number;
	        System.out.println("请输入日期:(年 月 日)");
	        Scanner in = new Scanner(System.in);
	        year = in.nextInt();
	        month = in.nextInt();
	        day = in.nextInt();
	        in.nextLine();
	        System.out.println("当前日期: " + year + "/" + month + "/" + day);
	  }
}
