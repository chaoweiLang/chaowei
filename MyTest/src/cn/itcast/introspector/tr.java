package cn.itcast.introspector;

import java.io.*;

public class tr {

	public static void main(String[] args)throws IOException {
		 String bookInfo="世界是平的\t350.0\tFriedman\t";
		
		 File dir_Books =new File("C:/Books");
		 File book1 =new File(dir_Books,"Book1.txt"); //创建一个虚拟file对象；
		 dir_Books.mkdirs();
         book1.createNewFile();                   //建立book1对象
        
        FileWriter fw =new FileWriter(book1);   //开启以book1文件之间的连接，并准备输出
        fw.write(bookInfo);                      //将bookInfo转化成byte型，写入指定文件book1
        fw.close();                                         //关闭连接，释放内存空间
        
        FileReader fis =new FileReader(book1);     //开启以book1文件之间的连接，并转杯输入
        
        System.out.println("书籍名称\t 价格\t 作者\t");
        System.out.println("------------------------------------");
        
        int i=0;
        while((i=fis.read()) !=-1)              //**只要读入的数值不为-1（代表文件结尾），就持续往下读取文件
       	 System.out.print((char)i);          //将读入的byte型转化为char型后输出，因为读入过byte型·所以中文会出现乱码
        fis.close();                                         ////关闭连接，释放内存空间
	}

}
