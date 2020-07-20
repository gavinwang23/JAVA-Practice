package wjw;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jisuanqi extends JFrame implements ActionListener{
	JTextField text1=new JTextField();
	JTextField text2=new JTextField();
	JTextField text3=new JTextField();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JLabel label1=new JLabel();
	
	public Jisuanqi() {
		setLayout(null);
		setTitle("计算器");
		text1.setBounds(50, 100, 100, 50);
		text2.setBounds(200, 100, 100, 50);
		text3.setBounds(350, 100, 100, 50);
		button1.setBounds(50, 200, 100, 50);
		button2.setBounds(200, 200, 100, 50);
		label1.setBounds(370, 60, 100, 50);
		label1.setText("输出");
		button1.setText("加");
		button2.setText("减");
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(text1);
		add(text2);
		add(text3);
		add(button1);
		add(button2);
		add(label1);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			String a1=text1.getText();
			int b1= Integer.parseInt(a1);
			String a2=text2.getText();
			int b2=Integer.parseInt(a2);
			int b3=b1+b2;
			String a3=Integer.toString(b3);
			text3.setText(a3);
		}
		if(e.getSource()==button2) {
			String a1=text1.getText();
			int b1= Integer.parseInt(a1);
			String a2=text2.getText();
			int b2=Integer.parseInt(a2);
			int b3=b1-b2;
			String a3=Integer.toString(b3);
			text3.setText(a3);
		}
	}
	public static void main(String args[]) {
		Jisuanqi box=new Jisuanqi();
		box.setBounds(500, 500, 500, 500);
		box.validate();
		box.setVisible(true);
	}
}
