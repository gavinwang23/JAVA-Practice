package wjw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;

public class txt {
	 public static void main(String[] args) {
		 String txtname="/Users/wangjunwei/Desktop/目录1/txt1.txt";
		 String newpath="/Users/wangjunwei/Desktop/目录1/目录2";
		 File file = new File(txtname);
		 
		 if(file.isFile()) {
			 System.out.println("是文件");
		 }
		 else {
			 System.out.println("是目录");
		 }
		 
		 File file2 = new File(newpath);    
		 if (!file2.exists()) {                       
		     file2.mkdirs();
		 }
		 
		 if (file.renameTo(new File(file2 +"/"+ file.getName()))) {  
             System.out.println("移动成功");  
         } else {  
             System.out.println("移动失败");  
         }
		 
		 String newpath2=file2 +"/"+file.getName();
		 System.out.println(newpath2);
		 
		 String k="";
		 String l="";
		 try
			{
			    InputStreamReader read = new InputStreamReader(new FileInputStream(newpath2),"gbk");//需要读取的文件路径
				BufferedReader br = new BufferedReader(read);
				String s = br.readLine();	
				
				while(s!=null)
				{				
					k=k+s;
					s= br.readLine();
				}
						br.close();
						read.close();
			}catch(IOException e)
				{
					System.out.println("指定文件不存在");
				}
		 System.out.println(k);
		 
		 int lenth=k.length();
		 String c[]=new String[lenth];
		 for(int i=0;i<lenth;i++) {
			 c[i]=k.substring(i, i+1);
		 }
		 for(int j=lenth-1;j>=0;j--) {
			 l=l+c[j];
		 }
		 System.out.println(l);
	 }
}
