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
			 System.out.print("<�ļ�>\t");
			 System.out.print(file.length()+"�ֽ�\t");
			 counter_file++;
			 totalSize+=file.length();
		 }
		 else{
			 System.out.print("<Ŀ¼>\t\t\t");
			 counter_dir++;
		 }
		 System.out.println(file.getName()+"\t");
		}
		System.out.println();
		System.out.println("\t\t"+counter_dir+"Ŀ¼");
		System.out.println("\t\t"+counter_file+"�ļ�\t"+totalSize+"�ֽ�");
	}

}
