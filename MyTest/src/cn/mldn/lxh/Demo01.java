package cn.mldn.lxh;

import java.awt.List;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Demo01 {
   

 
@Test
public void demo(){
	ArrayList list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	for(Object obj:list){
		int i =(Integer)obj;
		System.out.print(i);
	}
}
@Test
  public void test1(){               //��ͳ����һ
	 Map map=new LinkedHashMap();
	 map.put("1", "aaa");
	 map.put("2","bbb");
	 map.put("3","ccc");
	 Iterator it =map.keySet().iterator();   //���ַ������
	// Set set=map.keySet();          //map.keyset(),����map�ϰ����еļ�ֵkey��ɼ���Set�����������ء�
	// Iterator it =set.iterator();    //map.iterator()��ñ���������������
	 while(it.hasNext()){        //�������ϵ�����
		 String key=(String)it.next();    //key=it.next()��õ�����ֵ�����硰1��
		 String value=(String)map.get(key); //ͨ��һ����ֵ��1����������Ӧ��Exerciseֵ��
		 System.out.println(key+"="+value);
	 }
 }

@Test
public void test2(){          //��ǿforֻ�ʺ�ȡ���ݣ�Ҫ�޸�����򼯺��е����ݣ�Ҫ�ô�ͳ�ķ�ʽ
	 int arr[]={1,2,3};
	 for(int i:arr){
		 i=10;
	 }
	 System.out.println(arr[0]);
	 System.out.println(arr[1]);
	 System.out.println(arr[2]);
}

@Test
public void test3(){               //��ͳ������
	 Map map=new LinkedHashMap();
	 map.put("1", "aaa");
	 map.put("2","bbb");
	 map.put("3","ccc");
	 Set set=map.entrySet();
	 Iterator it =set.iterator();
	 while(it.hasNext()){
		 Map.Entry entry=(java.util.Map.Entry)it.next();    //���д�����Ҫ��֤
		 String key=(String)entry.getKey();
		 String value=(String)entry.getValue();
		 System.out.println(key+"="+value);
	 }

}

@Test
public void test4(){              //��ǿforȡMap����һ�ַ�ʽ    
	 Map map=new LinkedHashMap();
	 map.put("1", "aaa");
	 map.put("2","bbb");
	 map.put("3","ccc");
   for(Object obj:map.keySet()){
	   String key=(String)obj;
	   String value=(String)map.get(key);
	   System.out.println(key+"="+value);
   }
   
   //for(Object entry:map.entrySet(){Map.Entry entry =(Entry)Obj....
	 
	 
}





}