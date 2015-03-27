package cn.itcast.introspector;

import org.junit.Test;
import java.io.*;           



 
public class ABC {
   	   
   public static void main(String args[])throws IOException //IO类大多需要抛异常
   {
	   File dir_Books =new File("C:/Books");             //传入路径C：建立虚拟对象Books
	   File file_Book1 =new File(dir_Books,"Book1.txt"); //在虚拟file对象目录中建立虚拟file对象文件
	   
	   if(!dir_Books.exists()){     //检查dir_Books路径是否不存在；
		   System.out.print(dir_Books.getName()+"是否建立成功");  //取得目录名称
		   System.out.println(dir_Books.mkdirs());   //建立目录
	   }
	   else
		    System.out.println(dir_Books.getName()+"已存在");
	   
	   if(!file_Book1.exists()){
		   System.out.print(file_Book1.getName()+"是否建立成功");
		   System.out.println(file_Book1.createNewFile());  //建立文件
		   //file.deleteOnExit();
	   }
	   else
		    System.out.println(file_Book1.getParent());
	   
	   File file_Book2 =new File(file_Book1.getParent(),"Book2.txt");  //Book1上一层路径
	   System.out.println(file_Book1.getName()+"改名为"+file_Book2.getName());
	   System.out.print("是否修改成功：");
	   System.out.println(file_Book1.renameTo(file_Book2));//修改名字
	   System.out.print(file_Book2.getName()+"是否删除成功：");
	   System.out.println(file_Book2.delete());
	   System.out.print(dir_Books.getName()+"是否删除成功");
	   System.out.println(dir_Books.delete());
   }
   
 
}
	

