package day15;

import java.util.ArrayList;
import java.util.List;

/**
 * 自动装箱（基本类型转换为包装类型），自动拆箱（包装类型转换为基本类型）
 * 语法糖，编译器自动添加调用代码，方便阅读，减少编写代码的错误
 * 缓存范围，有些数字存放在缓存，比较不需要比较内存地址[-2^7~2^7-1],-128~127
 * @author 29ktsNelson
 * @date 2020年4月29日
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.自动装箱
		Boolean bool1=true;//编译器自动添加Boolean.valueOf(true)
		
		//2.自动拆箱
		boolean bool2=bool1;//编译器自动添加b1.booleanValue()
		
		//3.避免空指针异常
//		int i1=null;//错误，int不能为空
		Integer i2=null;//但Integer可以为空
		String logName="";
		String pwd=null;
		System.out.println("logName:"+logName+"pwd:"+pwd);//""与null不一样
		if (!logName.equals("")&(pwd!=null)) {
			System.out.println("不为空，登陆成功");
		}else {
			System.out.println("登陆失败");
		}
		
		//4.包装类构造方法（new）
		Boolean b3=new Boolean(false);
		System.out.println(b3);
		
		//5.集合自动查找
		List<Integer> integer=new ArrayList<>();
		List<User> user=new ArrayList<>();//列表，放置多条数据
		User u1=new User(1,"张三");
		user.add(u1);
		User u2=new User(2,"罗翔");
		user.add(u2);
		System.out.println(user);
		
		//6.缓存数字判定（==比较）
		Integer i3=Integer.valueOf(123456);//值在缓存范围外,false和true
		Integer i4=123456;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		Integer i5=Integer.valueOf(127);//值在缓存范围内，均为true,查看valueOf()方法可知
		Integer i6=127;
		System.out.println(i5==i6);
		System.out.println(i5.equals(i6));
	}

}
