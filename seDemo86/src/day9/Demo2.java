package day9;

/**
 * 控制符测试 
 * 1.private类 
 * 2.default类 同一包 
 * 3.protected类 同一包 子类 
 * 4.public类 同一包 子类 外部包
 * 
 * @author 29ktsNelson
 * @date 2020年4月22日
 */
public class Demo2 {
//	String name;
	private String name;// private只能在本类中访问

	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		demo2.name = "张三";
	}

}

class Other {
//	private String money;//子类无法使用
	protected String money;//子类可以使用
	void getName() {
//		GenderTest demo2 = new GenderTest();
//		demo2.name = "罗翔";
	}
}

class Other2 extends Other {
	void getFatherMoney() {
		Other other=new Other();
		other.money="亿万家产";//报错，无法作用于子类
	}
}