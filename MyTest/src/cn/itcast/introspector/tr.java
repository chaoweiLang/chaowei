package cn.itcast.introspector;

import java.io.*;

public class tr {

	public static void main(String[] args)throws IOException {
		 String bookInfo="������ƽ��\t350.0\tFriedman\t";
		
		 File dir_Books =new File("C:/Books");
		 File book1 =new File(dir_Books,"Book1.txt"); //����һ������file����
		 dir_Books.mkdirs();
         book1.createNewFile();                   //����book1����
        
        FileWriter fw =new FileWriter(book1);   //������book1�ļ�֮������ӣ���׼�����
        fw.write(bookInfo);                      //��bookInfoת����byte�ͣ�д��ָ���ļ�book1
        fw.close();                                         //�ر����ӣ��ͷ��ڴ�ռ�
        
        FileReader fis =new FileReader(book1);     //������book1�ļ�֮������ӣ���ת������
        
        System.out.println("�鼮����\t �۸�\t ����\t");
        System.out.println("------------------------------------");
        
        int i=0;
        while((i=fis.read()) !=-1)              //**ֻҪ�������ֵ��Ϊ-1�������ļ���β�����ͳ������¶�ȡ�ļ�
       	 System.out.print((char)i);          //�������byte��ת��Ϊchar�ͺ��������Ϊ�����byte�͡��������Ļ��������
        fis.close();                                         ////�ر����ӣ��ͷ��ڴ�ռ�
	}

}
