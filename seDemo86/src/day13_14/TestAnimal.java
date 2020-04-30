package day13_14;
/**
 * 抽象类
 * @author 29ktsNelson
 * @date 2020年4月27日
 */
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal() {//自动重写，只执行一次，像匿名对象一样
			
			@Override
			public void run(String name) {
				// TODO Auto-generated method stub
				System.out.println("animal的run方法");
			}

			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				
			}
		};
		animal.run(null);
	}

}
