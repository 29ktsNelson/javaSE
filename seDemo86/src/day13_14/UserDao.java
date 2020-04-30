package day13_14;
/**
 * 用户类的接口类CRUD（create,read,update,delete增删改查）
 * @author 29ktsNelson
 * @date 2020年4月27日
 */
public interface UserDao {
	//添加，前缀add,insert,save
	 boolean  addUser(User user);//编译器会自动添加public abstract。类作为参数传递
	 
	 //查询，前缀get,find,query,select
	 public abstract void getUser(User user);
	 
	 //修改，前缀edit,update,upd
	 public abstract int updateUser(User user);
	 
	 //删除，前缀delete,remove,del
	 //return 1表示成功，0表示失败
	 public abstract int delUser(User user);//id唯一
	 
}
