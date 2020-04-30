package day13_14;
/**
 * 抽象类的子类
 * @author 29ktsNelson
 * @date 2020年4月27日
 */
public class Human extends Animal {

	@Override
	public void run(String location) {//抽象类的子类强制重写抽象方法
		// TODO Auto-generated method stub
		System.out.println("在"+location+"遛弯");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("沙滩一躺三年半");
	}
	
	public void eat() {
		System.out.println("人恰饭");
	}
}
