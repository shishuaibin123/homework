package com;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Test {
	public static void txt(){
	    
		try (FileReader fInputStream = new FileReader("D:\\homework\\outport.txt");//读文件
		   FileWriter fOutputStream  = new FileWriter("D:\\homework\\import.txt")){//重新写入文件
		   StringBuffer st=new StringBuffer();
		
		  char[] ch=new char[14];//设置有14个字符
		  while ((fInputStream.read(ch)) !=-1) {
		    st.append(ch, 0,7);
		    st.append("，");
		    st.append(ch, 7, 7);
		    st.append("。"+"\n");
		  }
		  Student strs=new Student();
		  System.out.println(st);
	     fOutputStream.write(new String(st));
	     
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
		public static int countKey(String str, String readLine) {
			 
			  int index = 0;
			  int count = 0;
			 while((index=str.indexOf(readLine, index)) !=-1) {
				 index=index+readLine.length();
			   count++;
			  }
			  return count;
			 }
}



