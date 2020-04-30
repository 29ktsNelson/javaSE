package day7;
/**
 * 类和方法
 * @author 29ktsNelson
 * @date 2020年4月20日
 */
public class Demo1 {
	String name;
	int age;
	String addr;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Demo1 demo1=new Demo1();//无参构造器
		Demo1 demo2=new Demo1("张三");//
		Demo1 demo3=new Demo1("罗翔",24);
		Demo1 demo4=new Demo1(24,"beast","   ");
		System.out.println(demo2.name);
		System.out.println(demo3.name+demo3.age);
		System.out.println(demo4.name+demo4.age);
		demo2.sleep();
		demo2.sleep(demo2.name);//方法重载
	}

	/**
	 * 编写构造器，是为了调用或使用
	 */
	public Demo1() {//无参的构造方法，如果不写，编译器自动添加，只能添加一次
		// TODO Auto-generated constructor stub
	}

	public Demo1(String name) {
//		name=name;//输出为null
		this.name=name;
	}

	/**
	 * @param name
	 * @param age
	 * @param addr
	 */
	public Demo1(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}


	public Demo1(String name,int age) {
		this.age=age;
		this.name=name;
	}

	//构造方法只能返回对象，不能定义返回值
	//构造方法只能与类名一致，否则就变成一个普通方法
	public Demo1(int age,String name,String addr) {
		this.addr=addr;
		return;//结束代码
	}
	
	//方法重载
	public void sleep(){
		System.out.println("睡觉");
	}
	
	public void sleep(String name) {
		System.out.println(name+"睡觉");
	}
}
