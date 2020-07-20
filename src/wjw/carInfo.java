package wjw;

import java.util.Scanner;

class carr{
	private int wheelNum=9;
	private int weight;
	public void setwheelNum(int wheelNum) {
		this.wheelNum=wheelNum;
	}
	public int getwheelNum() {
		return wheelNum;
	}
	public void setweight(int weight) {
		this.weight=weight;
		System.out.println(999);
	}
	public int getweight() {
		return weight;
	}
	public void show(){
		System.out.print("车轮数："+wheelNum+"，重量："+weight);
	}
}
class smallcar extends carr{
	private int peopleNum;
	public void setpeopleNum(int peopleNum) {
		this.peopleNum=peopleNum;
	}
	public int getpeopleNum() {
		return peopleNum;
	}
	public void show(){
		System.out.print("，人数："+peopleNum);
	}
}
class truck extends smallcar{
	private int load;
	public void setload(int load) {
		this.load=load;
	}
	public int getwheelNum() {
		return load;
	}
	public void show(){
		System.out.print("，载重："+load);
	}
}

public class carInfo {
	public static void main (String[] args) {
		Scanner I= new Scanner(System.in);
		carr c=new smallcar();
		c.setweight(7);
		System.out.println(c.getwheelNum());
		System.out.println();
		c.setwheelNum(I.nextInt());
		
		c.setweight(I.nextInt());
		smallcar s=new smallcar();
		System.out.println("输入人数");
		s.setpeopleNum(I.nextInt());
		truck t=new truck();
		System.out.println("输入载重");
		t.setload(I.nextInt());
		c.show();
		s.show();
		t.show();
	}
}
