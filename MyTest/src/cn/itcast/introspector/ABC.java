package cn.itcast.introspector;

import org.junit.Test;
import java.io.*;           



 
public class ABC {
   	   
   public static void main(String args[])throws IOException //IO������Ҫ���쳣
   {
	   File dir_Books =new File("C:/Books");             //����·��C�������������Books
	   File file_Book1 =new File(dir_Books,"Book1.txt"); //������file����Ŀ¼�н�������file�����ļ�
	   
	   if(!dir_Books.exists()){     //���dir_Books·���Ƿ񲻴��ڣ�
		   System.out.print(dir_Books.getName()+"�Ƿ����ɹ�");  //ȡ��Ŀ¼����
		   System.out.println(dir_Books.mkdirs());   //����Ŀ¼
	   }
	   else
		    System.out.println(dir_Books.getName()+"�Ѵ���");
	   
	   if(!file_Book1.exists()){
		   System.out.print(file_Book1.getName()+"�Ƿ����ɹ�");
		   System.out.println(file_Book1.createNewFile());  //�����ļ�
		   //file.deleteOnExit();
	   }
	   else
		    System.out.println(file_Book1.getParent());
	   
	   File file_Book2 =new File(file_Book1.getParent(),"Book2.txt");  //Book1��һ��·��
	   System.out.println(file_Book1.getName()+"����Ϊ"+file_Book2.getName());
	   System.out.print("�Ƿ��޸ĳɹ���");
	   System.out.println(file_Book1.renameTo(file_Book2));//�޸�����
	   System.out.print(file_Book2.getName()+"�Ƿ�ɾ���ɹ���");
	   System.out.println(file_Book2.delete());
	   System.out.print(dir_Books.getName()+"�Ƿ�ɾ���ɹ�");
	   System.out.println(dir_Books.delete());
   }
   
 
}
	

