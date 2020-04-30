package day10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
		Father father=new Father("李大四",24);
		son.setAge(1);
		son.setName("张小三");
		son.setClassroom("三年级一班");
		System.out.println(son.getName()+"正在"+son.playGame("堡垒之夜"));
		
		Son son2=new Son("李四",1);
		System.out.println(son2.eat("胡健人"));
		System.out.println(father.eat("广door人"));
	}

}
