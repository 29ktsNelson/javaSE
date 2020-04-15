package homework_200414;

/**
 * 测试类
 * 
 * @author diyu-
 * @date 2020年4月14日
 */
public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String name1="张三"; String name2="罗翔";
		 */
		String[] name = { "张三", "罗翔" };
		//String[] time = { "08:34", "09:56", "12:13", "15:51", "17:31" };
		int[] hour = {8,9,12,15,16,18};//0~5
		int[] minute= {1,35,61};//o~2

		Time time1=new Time(hour[0],minute[0]); //08:01
		Time time2=new Time(hour[0],minute[2]); //08:61异常
		Time time3=new Time(hour[5],minute[0]);//18:01异常
		Time time4=new Time(hour[2],minute[1]);//12:35
		Time time5=new Time(hour[4],minute[0]);//16:01 
		Time time6=new Time(hour[4],minute[1]);//16:35 超三次，异常 
		
		Patient pt1 = new Patient(name[0]);
		System.out.println(pt1.pName + "的预约数为：" + pt1.count);
		Regiter reg1 = new Regiter();
		/*
		 * for (int i = 0; i <= 4; i++) { reg1.goRegiter(pt1, time[i]); }
		 */
		reg1.goRegiter(pt1, time1);
		reg1.goRegiter(pt1, time2);
		reg1.goRegiter(pt1, time3);
		reg1.goRegiter(pt1, time4);
		reg1.goRegiter(pt1, time5);
		reg1.goRegiter(pt1, time6);
	}

}
