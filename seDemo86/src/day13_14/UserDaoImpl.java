package day13_14;
/**
 * 接口实现类:用户
 * @author 29ktsNelson
 * @date 2020年4月27日
 */
public class UserDaoImpl implements UserDao{
//接口类有多少抽象方法，子类必须全部重写
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
//		boolean result=false;//一种方式
//		if (user!=null) {
//			System.out.println("添加一个用户，用户名为："+user.getName());
//			result=true;
//		}
//		return result;
		
		return ((user!=null)?true:false);//另一种方式
	}

	@Override
	public void getUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("查询一个用户，用户名为："+user.getName());
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("修改一个用户，用户名为："+user.getName());
		int updCount=0;
		User resultUser=findUserAll();
		if (user.getId()==resultUser.getId()) {//判断传进来的对象的id与仓库地址里的对象id是否一致
			
		}
		if (user!=null) {
			updCount=1;
		}
		return updCount;
	}

	@Override
	public int delUser(User user) {
		//return 1表示成功，0表示失败
		//判定传递参数的id在仓库地址是否有此人
		User user1=findUserAll();
		int del=0;
		if(user1.getId()!=0) {
			System.out.println("删除一个用户，id为："+user1.getId());
			del= 1;
		}
		return del;
	}
	
	public static User findUserAll()	{//存储数据
		return new User(1,"罗翔");
	}
}
