package day9;

import java.util.regex.Pattern;

/**
 * 封装类
 * @author 29ktsNelson
 * @date 2020年4月22日
 */
public class User {
	// 成员变量全部设为私有
	private int uid;
	private String uname;
	private int age;
	private String idCard;
	private String phone;
	private String qq;
	private String email;
	private House house;//类作为成员变量
	
	//set,get.对外引用，设置为public
	public void setUid(int uid) {
		this.uid=uid;
	}
	
	public  int getUid() {
		return uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {//设置高内聚
		if (age>0&&age<131) {
			this.age=age;
		}else {
			System.out.println("请输入正确的年龄");
		}
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {//正则表达式
		if (email.length()>5) {
//			if (Pattern.matches(regex, input)) {
//				
//			}
			this.email = email;
		}else {
			System.out.println("邮箱地址不合法");
		}
		
	}

	
	/**
	 * 构造方法，要给别的类引用，设置成public
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uid
	 * @param uname
	 * @param age
	 * @param idCard
	 * @param phone
	 * @param qq
	 * @param email
	 */
	public User(int uid, String uname, int age, String idCard, String phone, String qq, String email) {
		this.uid = uid;
		this.uname = uname;
		this.age = age;
		this.idCard = idCard;
		this.phone = phone;
		this.qq = qq;
		this.email = email;
	}

	//重写toString
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", age=" + age + ", idCard=" + idCard + ", phone=" + phone
				+ ", qq=" + qq + ", email=" + email + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
