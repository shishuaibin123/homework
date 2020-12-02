package com;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class FindWord {
	public static void main(String[] args) throws IOException {
		Student stu=new Student();
		stu.toshow();
		Test test = new Test();
		Test.txt();
		File files = new File("D:\\homework\\import.txt");
		FileInputStream fis=new FileInputStream(files);
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		int len;
		byte[] data = null;
		byte[] buffer = new byte[(int) files.length()];

		while ((len=fis.read(buffer))!=-1){
		    bos.write(buffer,0,len);
		}

		data = bos.toByteArray();
		String str = new String(data);

		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你要查找的字或词：");
		char o = sc.next().charAt(0);
		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length;i++){
		    if(o==ch[i]){
		        count++;
		    }

		}

		System.out.println("你输入的字或词在诗中出现过"+count+"次。");
		System.out.println("----------------------------");
		    fis.close();
		    bos.close();
	}
	
}
