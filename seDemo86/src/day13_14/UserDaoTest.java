package day13_14;
/**
 * 接口类的测试
 * @author 29ktsNelson
 * @date 2020年4月27日
 */
public class UserDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UserDaoImpl userDaoImpl=new UserDaoImpl();
		UserDao userDao=new UserDaoImpl();
		User user=new User(1,"张三");
		boolean flag=userDao.addUser(user);
		
		//子类接受
//		userDaoImpl.addUser(user);
//		userDaoImpl.updateUser(user);
//		userDaoImpl.getUser(user);
//		userDaoImpl.delUser(user);
//		System.out.println("----------------------------");
		
		//父类接受,一般用父类接受
		userDao.addUser(user);
		
		System.out.println(flag?"添加成功":"添加失败");
		userDao.updateUser(user);
		userDao.getUser(user);
		userDao.delUser(user);
		System.out.println(userDao.delUser(user)==0?"删除失败":"删除成功");
		System.out.println(user.toString());
	}

}
