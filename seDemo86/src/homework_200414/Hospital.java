package homework_200414;
/**
 * 测试类
 * @author diyu-
 * @date 2020年4月14日
 */
public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String name1="张三"; String name2="罗翔";
		 */
		String[] name= {"张三","罗翔"};
		String[] time= {"08:34","09:56","12:13","15:51","17:31"};
		
		Patient pt1=new Patient(name[0]);
		System.out.println(pt1.pName+"的预约数为："+pt1.count);
		Regiter reg1=new Regiter();
		for(int i=0;i<=3;i++) {
			reg1.goRegiter(pt1, time[i]);
		}
	}

}
