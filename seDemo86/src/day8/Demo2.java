package day8;
/**
 * 静态代码块
 * @author 29ktsNelson
 * @date 2020年4月21日
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Demo2 demo=new Demo2();
		demo.run();//先调用静态方法块，再初始化及调用非静态方法
	}

	//账号名,密码。因为不怎么变，使用静态名称
	static String dbName="admin";
	static String dbPwd="root";
	static {
		System.out.println("用户名："+dbName+"\t密码："+dbPwd);
	}
	
	public void run() {
		System.out.println("run方法");
	}
}
