package day8;
/**
 * 
 * @author 29ktsNelson
 * @date 2020年4月21日
 */
public class Demo3 {
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 demo1=new Demo3("罗翔");
		System.out.println("没有调用方法前："+demo1.name);
		System.out.println("没有调用方法前的地址"+demo1);
		runGetName(demo1);
		System.out.println("***************");
		runGetName2(demo1);
	}
	
	public Demo3(String name) {
		this.name=name;
	}
	
	public static void runGetName(Demo3 demo1) {//同一个对象赋不同的值
		demo1.name="张三";
		System.out.println("调用方法后的地址"+demo1);
		System.out.println("调用方法后的值"+demo1.name);
	}
	
	public static void runGetName2(Demo3 demo1) {//不同对象赋同样的值
		demo1=new Demo3(null);
		demo1.name="罗翔";
		System.out.println("调用方法2后的地址"+demo1);
		System.out.println(demo1.name);
	}
}
