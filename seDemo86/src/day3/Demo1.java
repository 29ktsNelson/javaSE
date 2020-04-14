package day3;
/**
 * 逻辑运算符： | & ^（使用少）
 * 					||短路或  &&短路与  ！取反  
 * @author diyu-
 * @date 2020年4月14日
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=-2>7;
		System.out.println(!flag);
		
		boolean f1=true;
		boolean f2=false;
		System.out.println(f2&f1);
		System.out.println(f2&&f1);//短路与，左边能做出判定就忽略右边
		System.out.println(f2|f1);
		System.out.println(f2||f1); //短路或，左边能做出判定就忽略右边
		
		//异常信息
		String name1="";
		String name2=null;
		System.out.println(name1.toString());
		//System.out.println(name2.toString());//导致异常
		
		System.out.println((7<9)?true:false);
		int sex=1;
		System.out.println((sex==0)?"male":"female");
		
		System.out.println(((5>6)&&(8<10)?true:false));
		System.out.println(("lisi".equals("lisi"))?"equals":"not equsls");
		
		int price=2;
		if(price<1.5) {
			System.out.println("买");
		}
		else System.out.println("不买");
	}

}
