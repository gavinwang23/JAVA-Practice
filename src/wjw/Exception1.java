package wjw;

import java.util.Scanner;

public class Exception1
{
  public static void main(String args[]){
    System.out.println("=========开始=========");
    Scanner s=new Scanner(System.in);
    System.out.println("请输入驾驶员年龄：");
    int age=s.nextInt();
    try{
      int i=18/0;
      System.out.println("计算结果："+ i);
    }catch(ArithmeticException e){
      System.out.println("出现了数学异常 "+ e);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("出现了数组异常 "+ e);
    }catch(RuntimeException e){
      System.out.println("出现了年龄异常 "+ e);
    }catch(Exception e){
      System.out.println("其他异常 "+e);
    }finally{
      System.out.println("不管是否有异常，我都执行。");
    }
    System.out.println("=========计算结束=========");
  }
}