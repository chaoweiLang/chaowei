package cn.itcast.introspector;

import java.io.*;

public class FileInOutEx {

	public static void main(String[] args)throws IOException {
		 String bookInfo="������ƽ��\t350.0\tFriedman\t";
		
         File book1 =new File("Book1.txt");       //����һ������file����
         book1.createNewFile();                   //����book1����
         
         FileOutputStream fos =new FileOutputStream(book1);   //������book1�ļ�֮������ӣ���׼�����
         fos.write(bookInfo.getBytes());                      //��bookInfoת����byte�ͣ�д��ָ���ļ�book1
         fos.close();                                         //�ر����ӣ��ͷ��ڴ�ռ�
         
         FileInputStream fis =new FileInputStream(book1);     //������book1�ļ�֮������ӣ���ת������
         
         System.out.println("�鼮����\t �۸�\t ����\t");
         System.out.println("------------------------------------");
         
         int i=0;
         while((i=fis.read()) !=-1)              //**ֻҪ�������ֵ��Ϊ-1�������ļ���β�����ͳ������¶�ȡ�ļ�
        	 System.out.print((char)i);          //�������byte��ת��Ϊchar�ͺ��������Ϊ�����byte�͡��������Ļ��������
         fis.close();                                         ////�ر����ӣ��ͷ��ڴ�ռ�
	}

}
