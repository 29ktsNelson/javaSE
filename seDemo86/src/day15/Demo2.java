package day15;

import day15.Boy.InnerClass;
import day15.Boy.StaticInner;

/**
 * 测试内部类
 * @author 29ktsNelson
 * @date 2020年4月29日
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//想调用内部类方法runInnerClass()，先要创建外部类Boy，再创建内部类InnerClass
		Boy.InnerClass inner=new Boy().new InnerClass();
		inner.runInnerClass();
		StaticInner.runStaticInner();
	}
	
}

class Boy{//外部类
	String addr1="三沙";
	
	public void showBoy() {
		System.out.println(addr1);
	}
	
	class InnerClass{//内部类
		String addr2="上海";
		
		public void runInnerClass() {
			System.out.println("外部类的名称"+Boy.this.addr1);
			System.out.println("内部类的名称"+addr2);
		}
		//非静态内部类不能调用内部静态类方法
		
	}
	
	static class StaticInner{
		public static void runStaticInner() {
			new Boy().new InnerClass().runInnerClass();
		}
	}
}

