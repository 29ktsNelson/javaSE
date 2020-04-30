package Test;

import com.sun.xml.internal.ws.api.ha.HaInfo;

import day9.House;
import day9.User;

public class D9UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	User user=new User(1,"张三",12,"123456741852963820","12378945612","11111","123@456.com");
	System.out.println(user.toString());
//	user.age="13";//报错，private无法引用
	user.setAge(13);
	System.out.println(user.toString());
	user.setAge(250);
	System.out.println(user.toString());
	
	House house=new House(1, "莫斯科红场一号克里姆林宫", "平房", 100, 0.2);
	user.setHouse(house);
	System.out.println(user.getUname()+"住址为"+user.getHouse().getAddr());
	}
	
	
}
