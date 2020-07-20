package wjw;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Poker2 extends JFrame implements ActionListener{
	String a[]= {"方块","梅花","黑桃","红桃"};
	String b[]= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	String[] c=new String[54];int t=0;int x=0;int y=0;
	public void produce() {
	int n=0;
	for(int i=0;i<13;i++) {
		for(int j=0;j<4;j++) {
			c[n]=a[j]+" "+b[i];
			n=n+1;
		}
	}
	c[52]="小王";
	c[53]="大王";
	t=(int) (Math.random()*54);
	}

JTextField text1=new JTextField();
JTextField text2=new JTextField();
JLabel label1=new JLabel("输出结果");
JLabel label2=new JLabel();
JButton button1=new JButton("产生A");
JButton button2=new JButton("产生B");
JButton button3=new JButton("比较");
JButton button4=new JButton("洗牌");
public Poker2() {
	setLayout(null);
	setTitle("扑克牌");
	text1.setBounds(100,50,100,50);
	text2.setBounds(300,50,100,50);
	label1.setBounds(150,150,300,50);
	label2.setBounds(245,50,50,50);
	button1.setBounds(110,250,80,50);
	button2.setBounds(310,250,80,50);
	button3.setBounds(110,350,80,50);
	button4.setBounds(310,350,80,50);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	add(text1);
	add(text2);
	add(label1);
	add(label2);
	add(button1);
	add(button2);
	add(button3);
	add(button4);
}

public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button1) {
		do{
			produce();
			x=t;
		}
		while(x==y) ;
		text1.setText(c[x]);
	}
	else if(e.getSource()==button2) {
		do{
			produce();
			y=t;
		}
		while(y==x) ;
		text2.setText(c[y]);
	}
	else if(e.getSource()==button3) {
		if(x<y) {
			label1.setText("B获胜");
			label2.setText("<");
		}
		else if(x>y){
			label1.setText("A获胜");
			label2.setText(">");
		}
		else {
			label1.setText("请发牌后再比较");
		}
	}
	else if(e.getSource()==button4) {
		x=0;y=0;
		text1.setText(null);
		text2.setText(null);
		label1.setText("重新发牌");
		label2.setText(null);
	}
	
}
public static void main(String args[]) {
	Poker2 box=new Poker2();
	box.setBounds(500, 500, 500, 500);
	box.validate();
	box.setVisible(true);
}
}