package day14;
import java.util.ArrayList;
import java.util.List;
/**
 * 包装类
 * @author 29ktsNelson
 * @date 2020年4月28日
 */
public class Demo1 {
	int i=0;
	//Integer
	List<Integer> list=new ArrayList<>();//<>内不能放置基本数据类型
	
	public static void main(String[] args) {
		//基本类型转为包装类对象，装箱
		Integer i1=new Integer(99);
		Integer i2=100;//同Integer i2=Integer.valueOf(100);
		System.out.println(i1);
		System.out.println(i2);
		
		Double double1=Double.valueOf("99.9");//自带强制转换类型
		System.out.println(double1);
		
		//包装类型转变为基本类型，拆箱
		int i3=i1;//编译器默认调用i1.intValue()
		double d2=double1;//编译器默认调用d1.doubleValue()
		
		//字符串转换为Integer
		Integer is4=new Integer("11");
		System.out.println(is4);
		
		//包装类转换为字符串
		String s1=i1.toString();
		String s2=i1+"";//+空字符串，转换为String类型,新生成对象
		System.out.println(s1);
		
		System.out.println(is4.MIN_VALUE);
	}
}
