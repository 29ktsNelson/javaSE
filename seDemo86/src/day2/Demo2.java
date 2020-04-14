package day2;
/**
 * 三目运算符，++和--
 * 比较运算符和equals方法
 * @author diyu-
 * @date 2020年4月13日
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//运算操作，+，-，*，/，%
		/*
		 * int num1=20; int num2=80; int sum=num1+num2; System.out.println(sum);
		 * System.out.println(num1+num2); System.out.println("和为："+num1+num2);
		 * System.out.println("和为："+(num1+num2));//加与不加括号的区别
		 */		
		
		/**
		 * a++，先运算，再自增；++a,先自增，后运算
		 */
		int a=3;
		System.out.println(a);
		int b=a++;
		System.out.println("a="+a);
		System.out.println(" b="+b);
		System.out.println("a++="+(a++));
		System.out.println("-------------");
		int c=3;
		System.out.println(c);
		int d=++c;
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("++c="+(++c));//在调试模式中可以看到数值变化过程
		
		System.out.println("--------------------------------");
		//比较操作
		int e=6;
		int f=8;
		System.out.println(e==f);
		System.out.println(e!=f);
		System.out.println(e>=f);
		
		//==与equals方法区别
		System.out.println("-------------");
		String name1="张三";
		String name2="李四";
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		System.out.println("-------------");
		String name3=new String("王五");
		String name4=new String("王五");
		System.out.println(name3==name4);//false，new String 是个对象，比较的必须类型一致，也是对象
		System.out.println(name3.equals(name4));//可以看下equals源代码
		
	}
	
}
