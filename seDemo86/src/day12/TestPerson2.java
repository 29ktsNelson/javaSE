package day12;
/**
 * 多态向上转型
 * @author 29ktsNelson
 * @date 2020年4月26日
 */
public class TestPerson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setName("张三");
		person.eat("馒头");
		person=new Man();
		person.eat("孢子");//自动找到person下是否有次子类，有则通过
		
		Man man=(Man) person;//强制转换
		man.setName("罗翔");
		man.eat("花卷");
		man.play("俄罗斯轮盘");
	}

}
