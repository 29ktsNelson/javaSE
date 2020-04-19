package day5;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1= {10086,10000,10001,12306,12315,12345};//0-5
		StringBuffer sbf=new StringBuffer();//临时存储区
		for(int i:arry1) {
			sbf.append(i+"，");
		}
		System.out.println("sbf的输出："+sbf);//不断追加字符串，注意.appengd()方法和+的区别，生成对象的数目
		//去掉最后一个逗号，substring 截取方法
		System.out.println("截取最后一个逗号："+sbf.substring(0, sbf.length()-1));
		System.out.println("****************字符串分割后使用数组接收****************");
		String[] arry2=sbf.substring(0, sbf.length()-1).split("，");
		for(String j:arry2) {
			System.out.println(j+"\b");
		}
	}
}
