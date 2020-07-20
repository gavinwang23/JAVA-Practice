package wjw;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class xuliehao extends JFrame implements ActionListener{
	JTextField text1=new JTextField();
	JTextField text2=new JTextField();
	JTextField text3=new JTextField();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	
	public xuliehao() {
		setLayout(null);
		setTitle("软件");
		text1.setBounds(50, 100, 100, 50);
		text2.setBounds(200, 100, 100, 50);
		text3.setBounds(350, 100, 100, 50);
		button1.setBounds(50, 200, 100, 50);
		button2.setBounds(200, 200, 100, 50);
		label1.setBounds(60, 60, 100, 50);
		label2.setBounds(200,60,200,50);
		label1.setText("请输入序列号");
		button1.setText("确认");
		button2.setText("重新输入");
		button1.addActionListener(this);
		button2.addActionListener(this);
		text1.addActionListener(this);
		text1.setDocument(new MyDocument(4));
		text2.setDocument(new MyDocument(4));
		text3.setDocument(new MyDocument(4));
		add(text1);
		add(text2);
		add(text3);
		add(button1);
		add(button2);
		add(label1);
		add(label2);
	}
	
	public class MyDocument extends PlainDocument{    //自定义限制长度，参考https://blog.csdn.net/rongyongfeikai2/article/details/6039496
		  
	    private int maxLength;  
	    public MyDocument(int newMaxLength)  
	    {  
	        super();  
	        maxLength=newMaxLength;  
	    }  
	    public MyDocument()  
	    {  
	        this(10);  
	    }  
	    public void insertString(int offset,String str,javax.swing.text.AttributeSet a) throws BadLocationException  
	    {  
	        if(getLength()+str.length()>maxLength)  
	        {  
	            return;  
	        }  
	        else if(getLength()+str.length()==maxLength) {
	        	    super.insertString(offset, str,a); 
	        	    if(text1.isFocusOwner()) {
	        	    	    text2.requestFocus();
	        	    }
	        	    else {
	        	     	text3.requestFocus();
	        	    }
	        	        
	        }
	        else  
	        {  
	            super.insertString(offset, str,a);  
	        }  
	    }  
	}  
	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==button1) {
			String a1=text1.getText();
			String a2=text2.getText();
			String a3=text3.getText();
			if(a1.equals("1234")&&a2.equals("5678")&&a3.equals("abcd")) {
				label2.setText("欢迎使用");
				Jisuanqi box2=new Jisuanqi();
				box2.setBounds(400, 250, 500, 500);
				box2.validate();
				box2.setVisible(true);
			}
			else {
				label2.setText("请输入正确的序列号");
			}
		}
		if(e.getSource()==button2) {
			text1.setText("");
			text2.setText("");
			text3.setText("");
			label2.setText("");
		}
	}
	public static void main(String args[]) {
		xuliehao box=new xuliehao();
		box.setBounds(300, 200, 500, 500);
		box.validate();
		box.setVisible(true);
	}
}
