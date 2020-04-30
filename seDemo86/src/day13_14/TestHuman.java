package day13_14;

public class TestHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=new Human();
		human.setName("张三");
		human.eat();
		human.run("沙壁上");
		human.sleep();
		
		System.out.println("---------------------------------");
		//多态
		Animal animal=new Human();
		animal.eat();
		animal.run("水塘里");
		animal.sleep();
	}

}
