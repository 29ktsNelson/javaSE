package day15;
/**
 * 枚举类测试
 * @author 29ktsNelson
 * @date 2020年4月29日
 */
public class GenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Gender.MALE);
		for (Gender g : Gender.values()) {//循环输出枚举类
			System.out.println(g);
		}
		
		User user=new User(1, "张三", Gender.MALE);
		System.out.println(user);
	}

}
