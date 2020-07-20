package wjw;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

class Customer {
	private String name;
	private int age;
	private boolean sex;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setsex(boolean sex) {
		this.sex=sex;
	}
	public boolean getsex() {
		return sex;
	}
}
public class StuInfo{
	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		ArrayList l=new ArrayList();
		c1.setname("张立");
		c1.setage(18);
		c1.setsex(false);
		c2.setname("王猛");
		c2.setage(22);
		c2.setsex(true);
		l.add(c1);
		l.add(c2);
		for(Iterator I=l.iterator();I.hasNext();) {
			Customer c = (Customer)I.next();
			System.out.println(c.getname()+" "+c.getage()+" "+(c.getsex()?"男":"女"));
		}
		
	}
}
