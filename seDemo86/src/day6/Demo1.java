package day6;

import java.util.Arrays;

/**
 * Arrays类
 * 查看数组长度
 * 对数组排序，sort方法
 * 比较数组，equal方法
 * 遍历数组
 * 数组中是否包括某个值
 * @author 29ktsNelson
 * @date 2020年4月17日
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints= {5,78,6,1,3,45,75,2,96,53};//0-9
		//长度
		System.out.println("长度为"+ints.length);
		System.out.println("*******************************");
		//升序
		Arrays.sort(ints);
		System.out.println("升序输出:");
		for(int i:ints) {
			System.out.print(i+"\t");
		}
		System.out.println("\n*******************************");		
		//降序
		System.out.println("降序输出");
		for(int i=ints.length-1;i>=0;i--) {
			System.out.print(ints[i]+"\t");
		}
		System.out.println("\n*******************************");	
		
		String logName=" 罗翔";
		boolean f=compareEq(logName);
		System.out.println(f?"客官里面请":"哪凉快哪呆着去");
	}
	private static boolean compareEq(String logName) {
		String[] name= {"张三","李四","罗翔"};
		boolean flag=false;
		for(String i:name) {
			if(i.equals(logName.trim())) {//trim去空格
				System.out.println(logName);
			}
			flag=true;
		}
		return flag;
	}
}
