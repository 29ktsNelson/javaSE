package day11;

public class TestIdCardEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users user1=new Users("01","1234567412581234", "张三");
		Users user2=new Users("02","1234567412581234", "罗翔");
		
		//判定方法equals
		if (user1.getIdCard().equals(user2.getIdCard())) {
			System.out.println("身份证号一致");
		}else {
			System.out.println("身份证号不一致");
		}
		
		//判定方法==
		if (user1.getIdCard()==user2.getIdCard()) {
			System.out.println("身份证号一致");
		}else {
			System.out.println("身份证号不一致");
		}
		
		//三目运算符
		System.out.println((user1==user2)?"一致":"不一致");
	}

}
