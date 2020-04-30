package day8;
/**
 * 
 * @author 29ktsNelson
 * @date 2020年4月21日
 */
public class Demo1 {
	String name;
	int age;
	String addr;
	double salary;
	static String userName;
	public static void main(String[] args) {
		Demo1 demo1=new Demo1("张三",11);
		Demo1 demo2=new Demo1("罗翔",12,"厚大法考",10.0);
		System.out.println(demo1.toString());
		System.out.println(demo2.toString());
		demo1.coding("这是一个名字");
		demo1.userName="张三的uName";
		System.out.println(demo1.userName);
	}
	public Demo1(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public Demo1(String name,int age,String addr,double salary) {
		this(name, age);//this()方法必须放在第一行，否则报错
		this.addr=addr;
		this.salary=salary;
	}
	
	public String toString() {//toString()方法的重写
		return "User:"+name;
	}
	
	public static  void sleep() {//j静态方法，属于方法区,只能调用静态成员变量
		System.out.println(userName);//userName是静态成员变量
//		System.out.println(name);//报错，name不是静态成员变量
//		coding();//报错
//		this.coding();//报错，静态方法无法调用非静态方法
	}
	
	public void coding(String name) {
		sleep();//非静态方法可以调用静态方法
		System.out.println(name);
		System.out.println(this.name);//两行name值不同
	}
}
