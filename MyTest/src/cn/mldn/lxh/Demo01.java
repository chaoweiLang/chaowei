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
  public void test1(){               //传统方法一
	 Map map=new LinkedHashMap();
	 map.put("1", "aaa");
	 map.put("2","bbb");
	 map.put("3","ccc");
	 Iterator it =map.keySet().iterator();   //两种方法亦可
	// Set set=map.keySet();          //map.keyset(),即从map上把其中的键值key组成集合Set数集，并返回。
	// Iterator it =set.iterator();    //map.iterator()获得便利器（迭代器）
	 while(it.hasNext()){        //遍历以上的数集
		 String key=(String)it.next();    //key=it.next()获得单个键值，比如“1”
		 String value=(String)map.get(key); //通过一个键值“1”，获得相对应的Exercise值。
		 System.out.println(key+"="+value);
	 }
 }

@Test
public void test2(){          //增强for只适合取数据，要修改数组或集合中的数据，要用传统的方式
	 int arr[]={1,2,3};
	 for(int i:arr){
		 i=10;
	 }
	 System.out.println(arr[0]);
	 System.out.println(arr[1]);
	 System.out.println(arr[2]);
}

@Test
public void test3(){               //传统方法二
	 Map map=new LinkedHashMap();
	 map.put("1", "aaa");
	 map.put("2","bbb");
	 map.put("3","ccc");
	 Set set=map.entrySet();
	 Iterator it =set.iterator();
	 while(it.hasNext()){
		 Map.Entry entry=(java.util.Map.Entry)it.next();    //次行代码需要验证
		 String key=(String)entry.getKey();
		 String value=(String)entry.getValue();
		 System.out.println(key+"="+value);
	 }

}

@Test
public void test4(){              //增强for取Map的另一种方式    
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