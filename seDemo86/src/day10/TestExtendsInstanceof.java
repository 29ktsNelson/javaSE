package day10;
/**
 * 追踪父类关系
 * @author 29ktsNelson
 * @date 2020年4月23日
 */
public class TestExtendsInstanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father=new Father();
		Son son=new Son();
		
		//多态
		Father father2=new Son();//只能用父类的方法，不能用子类的方法。可以从子类到父类
//		Son son2=new Father();//报错，不能从父类到子类
		
		System.out.println(father instanceof Father);//true属于这个类，false不是
		System.out.println(father instanceof Object);
		System.out.println(father instanceof Son);
		System.out.println(father2 instanceof Father);
		System.out.println(father2 instanceof Son);
	}

}
