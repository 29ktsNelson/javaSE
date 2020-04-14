package homework_200414;
/**
 * 挂号类，接受Patient类和挂号时间作为参数
 * goRegiter方法进行挂号
 * @author diyu-
 * @date 2020年4月14日
 */
public class Regiter {
	 public void goRegiter(Patient pt,String time){
		 pt.count++;
		 if(pt.count<=3) {
			 System.out.println("患者"+pt.pName+"于"+time+"第"+pt.count+"次挂号。剩余挂号次数"
						+(3-pt.count)+"次");
		 }
		 else {
			 System.out.println("今日预约数已满，请明天再来。");
		 }
	}
}
