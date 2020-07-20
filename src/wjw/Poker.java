package wjw;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Poker extends JFrame implements ActionListener{
	int a=0, b=0, a1=0, b1=0, a2=0, b2=0;//定义AB花色点数的全局变量
	String c=null, d=null;

	public void produce() {
		a=(int) (Math.random()*4+1);     //产生代表花色的随机数1～4
		b=(int) (Math.random()*13+2);    //产生代表点数的随机数2～14
		
		if(a==1) {
			c="方块";
		}
		else if(a==2) {
			c="梅花";
		}
		else if(a==3) {
			c="黑桃";
		}
		else{
			c="红桃";
		}                                 //完成花色字符串赋值
		
		if(b==11) {
			d="J";
		}
		else if(b==12) {
			d="Q";
		}
		else if(b==13) {
			d="K";
		}
		else if(b==14) {
			d="A";
		}
		else {
			d=Integer.toString(b);
		}                                  //完成点数字符串赋值
	}

JTextField text1=new JTextField();
JTextField text2=new JTextField();
JLabel label1=new JLabel("输出结果");
JLabel label2=new JLabel();
JButton button1=new JButton("产生A");
JButton button2=new JButton("产生B");
JButton button3=new JButton("比较");
JButton button4=new JButton("洗牌");
public Poker() {
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
		produce();
		a1=a;
		b1=b;
		text1.setText(c+" "+d);
	}
	else if(e.getSource()==button2) {
		produce();
		a2=a;
		b2=b;
		text2.setText(c+" "+d);
	}
	else if(e.getSource()==button3) {
		if(b1>b2) {                        //开始点数比较
			label1.setText("A获胜");
			label2.setText(">");
		}
		else if(b1<b2) {
			label1.setText("B获胜");
			label2.setText("<");
		}
		else {
			if(a1>a2) {                    //开始花色比较
				label1.setText("A获胜");
				label2.setText(">");
			}
			else if(a1<a2) {
				label1.setText("B获胜");
				label2.setText("<");
			}
			else {
				label1.setText("一样");
				label2.setText("=");
			}
		}
	}
	else if(e.getSource()==button4) {
		a1=0; a2=0; b1=0; b2=0;
		text1.setText(null);
		text2.setText(null);
		label1.setText("重新发牌");
		label2.setText(null);
	}
	
}
public static void main(String args[]) {
	Poker box=new Poker();
	box.setBounds(500, 500, 500, 500);
	box.validate();
	box.setVisible(true);
}
}

