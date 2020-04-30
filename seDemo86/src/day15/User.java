package day15;
/**
 * day15.Demo1 //5的例子
 * @author 29ktsNelson
 * @date 2020年4月29日
 */
public class User {
	private Integer id;
	private String name;
	private Gender gender;
	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 */
	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	/**
	 * @param id
	 * @param name
	 * @param gender
	 */
	public User(Integer id, String name, Gender gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	/**
	 * @param id
	 * @param name
	 */

	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

	
	
}
