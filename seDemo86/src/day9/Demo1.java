package day9;
/**
 * 没有封装，安全性问题样例
 * 年龄，手机号，身份证号
 * @author 29ktsNelson
 * @date 2020年4月22日
 */
public class Demo1 {
	//成员变量，属性，字段名称
	int age;
	String phone;
	String idCard;
	public Demo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 demo=new Demo1();
		demo.age=10;
		demo.phone="17245678978";
		System.out.println(demo.phone);
		validPhone(demo);
	}

	public static void showInfo() {
		
	}
	
	public static void validPhone(Demo1 demo) {
		if(demo.phone.length()>11) {
			System.out.println("长度有误");
			}else if (demo.phone.length()<11) {
				System.out.println("长度有误");
			}
	}
	
	
}
