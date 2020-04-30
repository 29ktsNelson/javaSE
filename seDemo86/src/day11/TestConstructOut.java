package day11;

public class TestConstructOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
	}

}

class Father{
	public Father() {
		super();
		System.out.println("进入father构造方法");
	}
}

class Son extends Father{
	public  Son() {
		super();
		System.out.println("son构造方法");
	}
}