package wjw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class English {

	public static void main(String[] args) {
		String txtname="/Users/wangjunwei/Desktop/目录1/english.txt";
		File file1 = new File(txtname);
		String str[]=new String[10];
		int hang=0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			String s=null;
			while((s=reader.readLine())!=null) {
				int l=s.length();
				int count=0;
				for(int i=0;i<l;i++) {
					if(!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')  && !(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
						count++;
					}
				}
				str[hang]=s+" "+count;
				//System.out.println(str[hang]);
				hang++;
			}
			System.out.println("读取完成");
		} catch (IOException e) {
			System.out.println("读取错误");
		}  
		
		try {
			File file2 = new File("/Users/wangjunwei/Desktop/目录1/englishCount.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
			for(int j=0;j<hang;j++) {
				bw.write(str[j]);
				bw.newLine();
			}
			bw.close();
			System.out.println("写入完成");
		} catch (IOException e) {
			System.out.println("写入错误");
		}

	}

}
