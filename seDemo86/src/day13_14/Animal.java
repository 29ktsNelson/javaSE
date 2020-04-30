package day13_14;
/**
 * 抽象类：普通类+抽象方法
 * 抽象方法不加方法体
 * @author 29ktsNelson
 * @date 2020年4月27日
 */
public abstract class Animal {
	private String name;
	
	//抽象方法
	public abstract void run(String location);
	
	public abstract void sleep();
	
	//普通方法
	public void eat() {
		System.out.println("进入animal类，准备恰饭");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
