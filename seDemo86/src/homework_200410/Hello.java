package homework_200410;
/**
 * 
 * @author diyu-
 * @date 2020年4月10日
 */ //快捷键 /**+enter

public class Hello {
//字符编码统一为UTF-8
//	这是主程序入口，main方法在一个class中最多有一个
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="秦川德里奇";
		int age=18;
		double index=22.22;
		String address="幽邃教堂";//String不属于8种基本类型，是个类，首字母大写
		String hobbies="Dark Souls III";
		char gender='M';
		boolean update=false;
		
		System.out.println("Hello World中文");		
		System.out.println("syso+alt+/ 自动补齐");//快捷键 syso+alt+/
		System.out.println();
		System.out.println("姓名："+userName);
		System.out.println("年龄："+age);
		System.out.println("集数："+index);
		System.out.println("地址："+address);
		System.out.println("爱好："+hobbies);
		System.out.println("性别："+gender);
		System.out.println("是否继续更新:"+update);
	}

}
	