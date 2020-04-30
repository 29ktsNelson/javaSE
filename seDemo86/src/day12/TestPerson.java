package day12;
/**
 * 多态条件：继承，子类对父类方法的重写，父类的引用指向子类的引用
 * @author 29ktsNelson
 * @date 2020年4月26日
 */
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.eat("蝙蝠");

		Man man=new Man();
		man.eat("中华菊头蝠");
		
		getBoy(new Man());//匿名对象，一次传递，一次使用
		System.out.println("-----------------------------");
		getSuperClass(person);
		getSuperClass(man);
	}

	public static void getBoy(Man man) {
		man.eat("穿山甲");
	}
	
	public static void getSuperClass(Person person) {//传递对象是最高类
		person.eat("恰饭");
	}
}
