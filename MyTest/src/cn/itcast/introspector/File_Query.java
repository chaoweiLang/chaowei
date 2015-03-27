package cn.itcast.introspector;

import java.io.*;
import java.util.*;


public class File_Query {

	public static void main(String[] args)throws IOException {
		File dir_current =new File("./");
		String[] fileList =dir_current.list();
		int counter_file=0;
		int counter_dir=0;
		long totalSize=0;
		for(int i=0;i<fileList.length;i++){
			File file = new File(dir_current,fileList[i]);
			Date changeTime = new Date(file.lastModified());
			System.out.print(changeTime+"\t");
			
		 if(file.isFile()){
			 System.out.print("<文件>\t");
			 System.out.print(file.length()+"字节\t");
			 counter_file++;
			 totalSize+=file.length();
		 }
		 else{
			 System.out.print("<目录>\t\t\t");
			 counter_dir++;
		 }
		 System.out.println(file.getName()+"\t");
		}
		System.out.println();
		System.out.println("\t\t"+counter_dir+"目录");
		System.out.println("\t\t"+counter_file+"文件\t"+totalSize+"字节");
	}

}
