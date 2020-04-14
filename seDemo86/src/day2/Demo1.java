package day2;

/**
 * 数据类型转换
 * 参数传递
 * 创建对象并调用
 * private,final关键字
 * @author diyu-
 * @date 2020年4月13日
 */
public class Demo1 {
	public static void main(String[] args) {
		// 1.自动类型转换，大类型可以装下小类型
		int i = 30;
		System.out.println(i);
		double b = i;
		System.out.println(b);

		// 2.强制类型转换，小类型转换成大类型
		double c = 80;
		int d = (int) c;// double类型强制转换成int类型
		System.out.println(d);
		String e = String.valueOf(c);// 字符类型的强制转换,用到了valueOf方法
		System.out.println(d);
		System.out.println(e);

		// 调用方法
		coding();
		// 传递参数到下一个方法里
		String name = "黑胶烤鸭";
		eat(name);

		// 创建对象
		Demo1 demo1 = new Demo1();//类名首字母大写，方法名首字母小写
		demo1.eat("谁");//注意这里的提醒
		
		//private方法
		demo1.sell(name);
		
		System.out.println("账号名："+USERNAME+",密码："+PASSWORD);
	}

	/**
	 * static方法,在没有创建对象的情况下调用方法/变量。 静态方法中不能访问非静态成员方法和非静态成员变量，
	 * 但是在非静态成员方法中是可以访问静态成员方法/变量的。
	 */
	public static void coding() {
		System.out.println("he is coding");
	}

	public static void eat(String name) {
		System.out.println("午饭吃的是" + name);
	}
	
	private  void sell(String na1) {
		System.out.println("晚上买的是"+na1);
	}
	
	//final关键字，值固定不变，不能写在main方法里
	public static final String USERNAME="qwert";//转大写快捷键：ctrl+shift+x
	public static final String PASSWORD="111111";//转小写快捷键：ctrl+shift+y
}
